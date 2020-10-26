package ru.mirea.lab16.managers;

import ru.mirea.lab16.interfaces.Order;
import ru.mirea.lab16.models.MenuItem;

public interface OrdersManager {
	int itemsQuantity(String itemName);
	int itemsQuantity(MenuItem item);
	Order[] getOrders();
	int ordersCostSummary();
	int ordersQuantity();
}
