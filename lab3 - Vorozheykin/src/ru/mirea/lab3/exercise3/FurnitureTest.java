package ru.mirea.lab3.exercise3;

public class FurnitureTest {

	public static void main(String[] args) {
		FurnitureShop shop = new FurnitureShop("IKEA");
		shop.add(new Sofa(100000, 250, 90, 60));
		shop.add(new Armchair(15000, 90, 85, 85));
		shop.add(new Armchair(13000, 80, 85, 80));
		System.out.println(shop + "\n");

		System.out.println("Shop name is " + shop.getName());
		System.out.println("Amount of furniture in stock: " + shop.quantityInStock());
		System.out.println("List of furniture:");
		int i = 1;

		for (Furniture furniture : shop.getFurnitureList()) {
			System.out.format("%d) %s\n", i++, furniture);
		}

		System.out.println("\nAmount of sofas: " + shop.amountOf("Sofa"));
		System.out.println("Amount of armchair: " + shop.amountOf("Armchair"));
	}
}
