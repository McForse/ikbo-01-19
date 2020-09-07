package ru.mirea.lab3.exercise2;

public class DogTest {

	public static void main(String[] args) {
		Shepherd shepherd = new Shepherd("Archie", 3);
		shepherd.displayInfo();
		shepherd.bark();

		System.out.println();

		Poodle poodle = new Poodle("Baron", 6);
		poodle.displayInfo();
		poodle.bark();
	}
}
