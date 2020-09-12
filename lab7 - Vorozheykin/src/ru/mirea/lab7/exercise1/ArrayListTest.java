package ru.mirea.lab7.exercise1;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> regions = new ArrayList<>();
		regions.add("Алтайский край");
		regions.add("Амурская область");
		regions.add("Архангельская область");
		regions.add("Астраханская область");
		regions.add("Белгородская область");

		System.out.println("Список добавленных регионов:");
		regions.forEach(System.out::println);

		regions.set(1, "Брянская область");
		System.out.println("\nЗаменили регион с индексом 1 на Брянскую область:");
		regions.forEach(System.out::println);

		if (regions.contains(regions.get(2))) {
			System.out.println("\n" + regions.get(2) + " содержится в списке");
		}

		regions.remove(regions.size() - 1);
		System.out.println("\nУдалили последний регион в списке:");
		regions.forEach(System.out::println);
	}
}
