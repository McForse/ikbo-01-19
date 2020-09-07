package ru.mirea.lab3.exercise1;

public class Cup extends Dish {
	private String material;
	private int capacity;

	public Cup(String material, int capacity) {
		super("Cup", "A cup is an open-top container " +
				"used to hold liquids for pouring or drinking");

		this.material = material;
		this.capacity = capacity;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		if (capacity < 0) throw new IllegalArgumentException("Capacity cannot be negative");
		this.capacity = capacity;
	}

	public void fill() {
		System.out.println(super.getName() + " filled with water");
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.format("Material: %s\nCapacity (ml): %s\n", material, capacity);
	}
}
