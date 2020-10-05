package ru.mirea.pr16.exercise1;

public final class Drink {
	private final int cost;
	private final String name;
	private final String description;

	public Drink(String name, String description) {
		cost = 0;
		this.name = name;
		this.description = description;
	}

	public Drink(int cost, String name, String description) {
		this.cost = cost;
		this.name = name;
		this.description = description;
	}

	public int getCost() {
		return cost;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
}
