package ru.mirea.pr16.exercise5.handlers;

import ru.mirea.pr16.exercise5.collections.LoopingLinkedList;
import ru.mirea.pr16.exercise5.models.Item;
import ru.mirea.pr16.exercise5.models.Order;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class OrderManager implements Order {
	private final LoopingLinkedList<Item> data;

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
		Object[] dataArray = data.toArray();

		for (Object item : dataArray) {
			if (((Item) item).getName().equals(itemName)) {
				return data.remove(item);
			}
		}

		return false;
	}

	@Override
	public int deleteAll(String itemName) {
		int count = 0;
		Object[] dataArray = data.toArray();

		for (Object item : dataArray) {
			if (((Item) item).getName().equals(itemName)) {
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
	public Item[] getArray() {
		Object[] dataArray = data.toArray();
		return Arrays.copyOf(dataArray, dataArray.length, Item[].class);
	}

	@Override
	public int getOrderCost() {
		int cost = 0;
		Object[] dataArray = data.toArray();

		for (Object item : dataArray) {
			cost += ((Item) item).getCost();
		}

		return cost;
	}

	@Override
	public int getItemsCountOf(String itemName) {
		int count = 0;
		Object[] dataArray = data.toArray();

		for (Object item : dataArray) {
			if (((Item) item).getName().equals(itemName)) {
				count++;
			}
		}

		return count;
	}

	@Override
	public String[] getArrayOfItemsName() {
		HashSet<String> itemsMap = new HashSet<>();
		Object[] dataArray = data.toArray();

		for (Object item : dataArray) {
				itemsMap.add(((Item) item).getName());
		}

		Object[] namesArray = itemsMap.toArray();

		return Arrays.copyOf(namesArray, namesArray.length, String[].class);
	}

	@Override
	public Item[] getSortedArrayByCostDesc() {
		Object[] dataArray = data.toArray();
		Object[] sortedArray = Arrays.stream(dataArray).sorted((i1, i2) -> ((Item) i2).getCost() - ((Item) i1).getCost()).toArray();
		return Arrays.copyOf(sortedArray, sortedArray.length, Item[].class);
	}
}
