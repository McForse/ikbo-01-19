package ru.mirea.pr3.exercise2;

public class Rectangle extends Shape {
	protected double width;
	protected double length;

	public Rectangle() {
	}

	public Rectangle(double width, double length) {
		setWidth(width);
		setLength(length);
	}

	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		setWidth(width);
		setLength(length);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if (width < 0) throw new IllegalArgumentException("Width cannot be negative");
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		if (length < 0) throw new IllegalArgumentException("Length cannot be negative");
		this.length = length;
	}

	@Override
	public double getArea() {
		return width * length;
	}

	@Override
	public double getPerimeter() {
		return (width + length) * 2;
	}

	@Override
	public String toString() {
		return "Rectangle{" +
				"width=" + width +
				", length=" + length +
				", color='" + color + '\'' +
				", filled=" + filled +
				'}';
	}
}
