package ru.mirea.pr12.exercise3;

public class Shirt {
	private final String model;
	private final String name;
	private final String color;
	private final String size;

	public Shirt(String data) {
		String[] result = data.split(",");
		if (result.length != 4) throw new IllegalArgumentException("Incorrect shirt format");
		this.model = result[0];
		this.name = result[1];
		this.color = result[2];
		this.size = result[3];
	}

	public Shirt(String model, String name, String color, String size) {
		this.model = model;
		this.name = name;
		this.color = color;
		this.size = size;
	}

	@Override
	public String toString() {
		return "model = " + model + '\n' +
				"name = " + name + '\n' +
				"color = " + color + '\n' +
				"size = " + size + '\n';
	}
}
