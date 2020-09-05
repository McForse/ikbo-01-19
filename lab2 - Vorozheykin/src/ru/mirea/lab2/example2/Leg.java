package ru.mirea.lab2.example2;

public class Leg {
	private int length;

	public Leg(int length) {
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Leg{" +
				"length=" + length +
				'}';
	}
}
