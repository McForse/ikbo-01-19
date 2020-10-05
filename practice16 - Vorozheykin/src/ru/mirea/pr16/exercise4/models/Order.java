package ru.mirea.pr16.exercise4.models;

public interface Order {
	boolean add(Item item);
	boolean delete(String itemName);
	int deleteAll(String itemName);
	int getItemsCount();
	Object[] getArray();
	int getOrderCost();
	int getItemsCountOf(String itemName);
	String[] getArrayOfItemsName();
	Object[] getSortedArrayByCostDesc();
}