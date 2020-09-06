package ru.mirea.lab3.example1;

public class Plate extends Dish {
	private int size;
	private String color;

	public Plate(int size, String color) {
		super("Plate", "A plate is a broad, concave," +
				" but mainly flat vessel on which food can be served"
		);

		this.size = size;
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void fillWithFood() {
		System.out.println(super.getName() + " is filled with food");
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.format("Size (cm): %s\nColor: %s\n", size, color);
	}
}
