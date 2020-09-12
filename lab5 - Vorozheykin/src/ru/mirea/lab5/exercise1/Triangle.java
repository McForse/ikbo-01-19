package ru.mirea.lab5.exercise1;

import java.awt.*;

public class Triangle extends Shape {
	private int base;
	private int height;

	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	public Triangle(int base, int height, Color color) {
		super(color);
		this.base = base;
		this.height = height;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
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
		g.fillPolygon(new int[]{0, base / 2, base}, new int[]{height, 0, height}, 3);
	}
}
