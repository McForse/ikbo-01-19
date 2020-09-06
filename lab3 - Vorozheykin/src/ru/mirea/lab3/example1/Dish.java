package ru.mirea.lab3.example1;

public abstract class Dish {
	private String name;
	private String description;

	public Dish(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void displayInfo() {
		System.out.format("Name: %s\n" +
				"Description: %s\n", name, description);
	}
}
