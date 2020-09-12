package ru.mirea.lab4.exercise1;

public class Car implements Nameable {
	private final String brand;
	private final String model;

	public Car(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	@Override
	public String getName() {
		return brand + " " + model;
	}
}
