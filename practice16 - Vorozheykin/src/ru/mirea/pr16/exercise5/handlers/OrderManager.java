package ru.mirea.pr16.exercise5.handlers;

import ru.mirea.pr16.exercise5.collections.LoopingLinkedList;
import ru.mirea.pr16.exercise5.models.Item;
import ru.mirea.pr16.exercise5.models.Order;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class OrderManager implements Order {
	private LoopingLinkedList<Item> data;

	public OrderManager() {
		this.data = new LoopingLinkedList<>();
	}

	public OrderManager(Collection<Item> collection) {
		this.data = new LoopingLinkedList<>(collection);
	}

	@Override
	public boolean add(Item item) {
		return data.add(item);
	}

	@Override
	public boolean delete(String itemName) {
		for (Item item : data.toArray()) {
			if (item.getName().equals(itemName)) {
				return data.remove(item);
			}
		}

		return false;
	}

	@Override
	public int deleteAll(String itemName) {
		int count = 0;

		for (Item item : data.toArray()) {
			if (item.getName().equals(itemName)) {
				data.remove(item);
				count++;
			}
		}

		return count;
	}

	@Override
	public int getItemsCount() {
		return data.getSize();
	}

	@Override
	public Object[] getArray() {
		return data.toArray();
	}

	@Override
	public int getOrderCost() {
		int cost = 0;

		for (Item item : data.toArray()) {
			cost += item.getCost();
		}

		return cost;
	}

	@Override
	public int getItemsCountOf(String itemName) {
		int count = 0;

		for (Item item : data.toArray()) {
			if (item.getName().equals(itemName)) {
				count++;
			}
		}

		return count;
	}

	@Override
	public String[] getArrayOfItemsName() {
		HashSet<String> itemsMap = new HashSet<>();

		for (Item item : data.toArray()) {
			itemsMap.add(item.getName());
		}

		return (String[]) itemsMap.toArray();
	}

	@Override
	public Object[] getSortedArrayByCostDesc() {
		return Arrays.stream(
				data.toArray())
				.sorted((i1, i2) -> i2.getCost() - i1.getCost())
				.toArray();
	}
}
