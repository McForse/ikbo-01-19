package ru.mirea.lab4.exercise1;

public class Dog implements Nameable {
	private final String name;
	private final String breed;

	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}

	@Override
	public String getName() {
		return name;
	}

	public String getBreed() {
		return breed;
	}
}
