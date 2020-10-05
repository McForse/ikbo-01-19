package ru.mirea.pr16.exercise3.handlers;

import ru.mirea.pr16.exercise3.models.Item;
import ru.mirea.pr16.exercise5.collections.LoopingLinkedList;

public class Order {
	private LoopingLinkedList<Item> data;

	public Order() {
		this.data = new LoopingLinkedList<>();
	}

	private boolean add(Item item) {
		return data.add(item);
	}

	private boolean remove(Item item) {
		return data.remove(item);
	}
}
