package ru.mirea.pr16.exercise5.models;

public interface Order {
	boolean add(Item item);
	boolean delete(String itemName);
	int deleteAll(String itemName);
	int getItemsCount();
	Item[] getArray();
	int getOrderCost();
	int getItemsCountOf(String itemName);
	String[] getArrayOfItemsName();
	Item[] getSortedArrayByCostDesc();
}