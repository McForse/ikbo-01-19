package ru.mirea.lab5.exercise1;

import java.awt.*;

public class Oval extends Shape {
	private int width;
	private int height;

	public Oval(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public Oval(int width, int height, Color color) {
		super(color);
		this.width = width;
		this.height = height;
	}

	@Override
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	protected void paintComponent(Graphics g) {
		g.setColor(color);
		g.fillOval(0, 0, width, height);
	}
}
