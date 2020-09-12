package ru.mirea.lab5.exercise1;

import java.awt.*;

public class Circle extends Oval {
	private int radius;

	public Circle(int radius) {
		super(radius * 2, radius * 2);
		this.radius = radius;
	}

	public Circle(int radius, Color color) {
		super(radius * 2, radius * 2, color);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}
