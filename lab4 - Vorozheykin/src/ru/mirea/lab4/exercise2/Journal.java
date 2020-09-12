package ru.mirea.lab4.exercise2;

public class Journal implements Priceable {
	private final String name;
	private final int price;

	public Journal(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Journal \"" + name + "\"";
	}
}
