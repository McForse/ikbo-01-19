package ru.mirea.lab5.exercise3;

import javax.swing.*;
import java.awt.*;

public class Animation extends JFrame {

	public Animation() {
		initComponents();
	}

	private void initComponents() {
		setTitle("Fire animation");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setMaximumSize(new Dimension(180, 200));
		getRootPane().setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		add(new FireSprite());
		pack();
	}

	public static void main(String[] args) {
		new Animation().setVisible(true);
    }
}
