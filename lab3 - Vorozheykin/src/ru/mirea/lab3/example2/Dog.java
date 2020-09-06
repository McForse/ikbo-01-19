package ru.mirea.lab3.example2;

public abstract class Dog {
	public String breed;

	public String name;
	public int age;

	public Dog(String breed, String name, int age) {
		this.breed = breed;
		this.name = name;
		setAge(age);
	}

	public String getBreed() {
		return breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) throw new IllegalArgumentException("Age cannot be negative");
		this.age = age;
	}

	public void bark() {
		System.out.println(name + " is barking");
	}

	public void displayInfo() {
		System.out.format("Name: %s\nAge: %s\nBreed: %s\n", name, age, breed);
	}
}
