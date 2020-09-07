package ru.mirea.lab2.exercise2;

public class Leg {
	private int length;

	public Leg(int length) {
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		if (length < 0) throw new IllegalArgumentException("Length cannot be negative");
		this.length = length;
	}

	@Override
	public String toString() {
		return "Leg{" +
				"length=" + length +
				'}';
	}
}
