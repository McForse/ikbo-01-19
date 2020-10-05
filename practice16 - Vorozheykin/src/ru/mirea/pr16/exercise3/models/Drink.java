package ru.mirea.pr16.exercise3.models;

public final class Drink implements Item {
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

	@Override
	public int getCost() {
		return cost;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}
}
