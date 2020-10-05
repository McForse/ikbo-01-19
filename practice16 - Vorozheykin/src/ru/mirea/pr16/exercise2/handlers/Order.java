package ru.mirea.pr16.exercise2.handlers;

import ru.mirea.pr16.exercise2.collections.LinkedList;
import ru.mirea.pr16.exercise2.models.Item;

public class Order {
	private LinkedList<Item> data;

	public Order() {
		this.data = new LinkedList<>();
	}

	private boolean add(Item item) {
		return data.add(item);
	}

	private boolean remove(Item item) {
		return data.remove(item);
	}
}
