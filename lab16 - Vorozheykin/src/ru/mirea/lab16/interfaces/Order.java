package ru.mirea.lab16.interfaces;

import ru.mirea.lab16.models.Customer;
import ru.mirea.lab16.models.MenuItem;

public interface Order {
	boolean add(MenuItem item);
	String[] itemsNames();
	int itemsQuantity();
	int itemQuantity(String itemName);
	int itemQuantity(MenuItem itemName);
	MenuItem[] getItems();
	boolean remove(String itemName);
	boolean remove(MenuItem item);
	int removeAll(String itemName);
	int removeAll(MenuItem item);
	MenuItem[] sortedItemsByCostDesc();
	int costTotal();
	Customer getCustomer();
	void setCustomer(Customer customer);
}