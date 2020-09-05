package ru.mirea.lab1;

public class Ball {
	private final int size;

	private final String color;

	private final double weight;

	public Ball(int size, String color, double weight) {
		this.size = size;
		this.color = color;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Ball{" +
				"size=" + size +
				", color='" + color + '\'' +
				", weight=" + weight +
				'}';
	}
}
