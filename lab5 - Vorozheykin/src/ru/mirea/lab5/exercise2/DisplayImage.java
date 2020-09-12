package ru.mirea.lab5.exercise2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class DisplayImage extends JFrame {
	private final URL url;

	public DisplayImage(String url) throws MalformedURLException {
		this.url = new URL(url);
		initComponents();
	}

	private void initComponents() {
		setTitle("Image");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getRootPane().setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		try {
			BufferedImage image = ImageIO.read(url);
			JLabel label = new JLabel(new ImageIcon(image));
			add(label);
			pack();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws MalformedURLException {
		if (args.length == 0) throw new IllegalArgumentException("Url not specified");
		new DisplayImage(args[0]).setVisible(true);
    }
}
