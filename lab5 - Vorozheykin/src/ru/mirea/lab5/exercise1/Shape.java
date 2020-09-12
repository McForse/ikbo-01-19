package ru.mirea.lab5.exercise1;

import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JPanel {
	protected Color color;

	public Shape() {
		color = Color.BLACK;
	}

	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	protected abstract void paintComponent(Graphics g);
}
