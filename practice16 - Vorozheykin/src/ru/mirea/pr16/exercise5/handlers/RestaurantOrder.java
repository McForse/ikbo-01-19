package ru.mirea.pr16.exercise5.handlers;

import ru.mirea.pr16.exercise5.models.Item;

import java.util.Collection;

public class RestaurantOrder extends OrderManager {
	public RestaurantOrder() {}

	public RestaurantOrder(Collection<Item> collection) {
		super(collection);
	}
}
