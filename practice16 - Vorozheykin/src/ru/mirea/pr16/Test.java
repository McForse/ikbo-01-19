package ru.mirea.pr16;

import ru.mirea.pr16.exercise5.handlers.InternetOrder;
import ru.mirea.pr16.exercise5.handlers.RestaurantOrder;
import ru.mirea.pr16.exercise5.models.Dish;
import ru.mirea.pr16.exercise5.models.Drink;
import ru.mirea.pr16.exercise5.models.Item;
import ru.mirea.pr16.exercise5.models.Order;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Item dish1 = new Dish(300, "Fried fish", "Tasty fried fish");
		Item dish2 = new Dish(400, "Pasta", "Staple ingredient for many dishes");

		Item drink1 = new Drink(50, "Coffee", "Brewed drink prepared from roasted coffee beans");
		Item drink2 = new Drink(100, "Orange juice", "Liquid extract of the orange tree fruit");

		Order order = new RestaurantOrder();
		order.add(dish1);
		order.add(dish2);
		order.add(drink1);
		order.add(drink2);
		System.out.println("RestaurantOrder:");
		System.out.println(Arrays.toString(order.getArray()));

		System.out.println("\nSorted by cost desc:");
		System.out.println(Arrays.toString(order.getSortedArrayByCostDesc()));

		order.delete("Coffee");
		System.out.println("\nDelete coffee:");
		System.out.println(Arrays.toString(order.getArray()));

		System.out.println("\nItems in order: " + order.getItemsCount());
		System.out.println("Order cost: " + order.getOrderCost());
		System.out.println("Count of paste: " + order.getItemsCountOf("Pasta"));
		System.out.println("\nArray of items name:");
		System.out.println(Arrays.toString(order.getArrayOfItemsName()));

		System.out.println("\n----------\n");

		InternetOrder order2 = new InternetOrder();
		order2.add("Moscow", dish1);
		order2.add("Moscow", drink1);

		System.out.println("InternetOrder:");
		order2.getOrders();
	}
}