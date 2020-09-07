package ru.mirea.lab3.exercise1;

public class DishTest {

	public static void main(String[] args) {
		Plate plate = new Plate(15, "white");
		System.out.format("%s - %s\n", plate.getName(), plate.getDescription());
		plate.displayInfo();
		plate.fillWithFood();

		System.out.println();

		Cup cup = new Cup("glass", 450);
		System.out.format("%s - %s\n", cup.getName(), cup.getDescription());
		cup.displayInfo();
		cup.fill();
	}
}
