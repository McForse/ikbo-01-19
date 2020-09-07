package ru.mirea.pr3.exercise2;

public class Square extends Rectangle {

	public Square() {}

	public Square(double side) {
		super(side, side);
	}

	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}

	public double getSide() {
		return getLength();
	}

	public void setSide(double side) {
		if (side < 0) throw new IllegalArgumentException("Side cannot be negative");
		setLength(side);
		setWidth(side);
	}

	@Override
	public void setWidth(double width) {
		super.setWidth(width);
	}

	@Override
	public void setLength(double length) {
		super.setLength(length);
	}

	@Override
	public String toString() {
		return "Square{" +
				"side=" + length +
				", color='" + color + '\'' +
				", filled=" + filled +
				'}';
	}
}
