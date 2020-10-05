package ru.mirea.pr16.exercise4.handlers;

import ru.mirea.pr16.exercise4.collections.LoopingLinkedList;
import ru.mirea.pr16.exercise4.models.Item;
import ru.mirea.pr16.exercise4.models.Order;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class InternetOrder implements Order {
	private LoopingLinkedList<Item> data;

	public InternetOrder() {
		this.data = new LoopingLinkedList<>();
	}

	public InternetOrder(Collection<Item> collection) {
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
		return (Item[]) Arrays.stream(
				data.toArray())
				.sorted((i1, i2) -> (int) (i2.getCost() - i1.getCost()))
				.toArray();
	}
}
