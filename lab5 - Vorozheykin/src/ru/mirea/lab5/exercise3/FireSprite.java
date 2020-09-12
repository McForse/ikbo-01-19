package ru.mirea.lab5.exercise3;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FireSprite extends JPanel implements ActionListener {
	private BufferedImage image;
	private final int width = 130;
	private final int height = 150;
	private final int sprites = 4;
	private final int delay = 100;
	private int current;
	private Timer timer;

	public FireSprite() {
		File file = new File("src/ru/mirea/lab5/exercise3/fire.png");

		try {
			image = ImageIO.read(file);
			startAnimation();
		} catch (IOException e) {
			e.printStackTrace();
		}

		setSize(getPreferredSize());
		startAnimation();
	}

	private void startAnimation() {
		if (timer == null) {
			current = 0;
			timer = new Timer(delay, this);
			timer.start();
		} else if (!timer.isRunning()) {
			timer.restart();
		}
	}

	public void stopAnimation() {
		timer.stop();
	}

	public Dimension getPreferredSize() {
		return new Dimension(width, height);
	}

	@Override
	protected void paintComponent(Graphics g) {
		current = current % sprites;
		BufferedImage clip = image.getSubimage(width * current, 0, width, height);
		//g.clipRect(width * current, 0, width, height);
		g.drawImage(clip, 0, 0, null);
		current++;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
	}
}
