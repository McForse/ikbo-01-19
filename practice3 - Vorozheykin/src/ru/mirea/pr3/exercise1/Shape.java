package ru.mirea.pr3.exercise1;

public abstract class Shape {
	private final String type;

	public Shape(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
}
