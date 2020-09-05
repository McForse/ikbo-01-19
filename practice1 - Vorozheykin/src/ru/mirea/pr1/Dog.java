package ru.mirea.pr1;

public class Dog {
	private final String name;

	private final int age;

	private final String breed;

	private final double weight;

	public Dog(String name, int age, String breed, double weight) {
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Dog{" +
				"name='" + name + '\'' +
				", age=" + age +
				", breed='" + breed + '\'' +
				", weight=" + weight +
				'}';
	}
}
