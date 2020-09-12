package ru.mirea.lab4.exercise2;

public class PriceableTest {

	public static void main(String[] args) {
		Priceable journal = new Journal("Hacker", 250);
		Priceable book = new Book("Michael Bulgakov", "Master and Margarita", 400);

		System.out.println("Prices in rubles:");
		System.out.println(journal + " - " + journal.getPrice());
		System.out.println(book + " - " + book.getPrice());
	}
}
