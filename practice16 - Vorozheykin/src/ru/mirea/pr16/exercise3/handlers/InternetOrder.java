package ru.mirea.pr16.exercise3.handlers;

import ru.mirea.pr16.exercise3.collections.LoopingLinkedList;
import ru.mirea.pr16.exercise3.models.Item;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class InternetOrder {
	private LoopingLinkedList<Item> data;

	public InternetOrder() {
		this.data = new LoopingLinkedList<>();
	}

	public InternetOrder(Collection<Item> collection) {
		this.data = new LoopingLinkedList<>(collection);
	}

	public boolean add(Item item) {
		return data.add(item);
	}

	public boolean delete(String itemName) {
		for (Item item : data.toArray()) {
			if (item.getName().equals(itemName)) {
				return data.remove(item);
			}
		}

		return false;
	}

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

	public int getItemsCount() {
		return data.getSize();
	}

	public Item[] getArray() {
		return data.toArray();
	}

	public int getOrderCost() {
		int cost = 0;

		for (Item item : data.toArray()) {
			cost += item.getCost();
		}

		return cost;
	}

	public int getItemsCountOf(String itemName) {
		int count = 0;

		for (Item item : data.toArray()) {
			if (item.getName().equals(itemName)) {
				count++;
			}
		}

		return count;
	}

	public String[] getArrayOfItemsName() {
		HashSet<String> itemsMap = new HashSet<>();

		for (Item item : data.toArray()) {
			itemsMap.add(item.getName());
		}

		return (String[]) itemsMap.toArray();
	}

	public Item[] getSortedArrayByCostDesc() {
		return (Item[]) Arrays.stream(
				data.toArray())
				.sorted((i1, i2) -> (int) (i2.getCost() - i1.getCost()))
				.toArray();
	}
}
