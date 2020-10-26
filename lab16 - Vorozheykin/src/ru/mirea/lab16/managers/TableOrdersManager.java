package ru.mirea.lab16.managers;

import ru.mirea.lab16.interfaces.Order;
import ru.mirea.lab16.models.MenuItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TableOrdersManager implements OrdersManager {
	Order[] orders = new Order[50];

	public void add(Order order, int tableNumber) {
		orders[tableNumber] = order;
	}

	public void addItem(MenuItem item, int tableNumber) {
		orders[tableNumber].add(item);
	}

	public int freeTableNumber() {
		for (int i = 0; i < orders.length; i++) {
			if (orders[i] == null) return i;
		}

		return -1;
	}

	public int[] freeTableNumbers() {
		List<Integer> freeItemsList = new ArrayList<>();

		for (int i = 0; i < orders.length; i++) {
			if (orders[i] == null) {
				freeItemsList.add(i);
			}
		}

		int[] freeItemsArray = new int[freeItemsList.size()];

		for (int i = 0; i < freeItemsArray.length; i++) {
			freeItemsArray[i] = freeItemsList.get(i);
		}

		return freeItemsArray;
	}

	public Order getOrder(int tableNumber) {
		return orders[tableNumber];
	}

	void remove(int tableNumber) {
		orders[tableNumber] = null;
	}

	int remove(Order order) {
		for (int i = 0; i < orders.length; i++) {
			if (orders[i].equals(order)) {
				orders[i] = null;
				return i;
			}
		}

		return -1;
	}

	int removeAll(Order order) {
		int count = 0;

		for (int i = 0; i < orders.length; i++) {
			if (orders[i].equals(order)) {
				orders[i] = null;
				count++;
			}
		}

		return count;
	}

	@Override
	public int itemsQuantity(String itemName) {
		int count = 0;

		for (Order order : orders) {
			count += order.itemQuantity(itemName);
		}

		return count;
	}

	@Override
	public int itemsQuantity(MenuItem item) {
		return itemsQuantity(item.getName());
	}

	@Override
	public Order[] getOrders() {
		return orders;
	}

	@Override
	public int ordersCostSummary() {
		return Arrays.stream(getOrders()) .mapToInt(Order::costTotal).sum();
	}

	@Override
	public int ordersQuantity() {
		return orders.length;
	}
}
