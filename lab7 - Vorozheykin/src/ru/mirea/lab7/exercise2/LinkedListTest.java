package ru.mirea.lab7.exercise2;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> regions = new LinkedList<>();
		regions.add("Республика Адыгея");
		regions.add("Республика Алтай");
		regions.add("Республика Башкортостан");
		regions.add("Республика Бурятия");
		regions.add("Республика Дагестан");

		System.out.println("Список добавленных регионов:");
		regions.forEach(System.out::println);

		regions.addFirst("Республика Ингушетия");
		System.out.println("\nДобавили на первое место Республику Ингушетию:");
		regions.forEach(System.out::println);

		regions.add(1, "Республика Калмыкия");
		System.out.println("\nДобавили Республику Калмыкию по индексу 1:");
		regions.forEach(System.out::println);

		if (regions.contains(regions.get(4))) {
			System.out.println("\n" + regions.get(4) + " содержится в списке");
		}

		regions.removeFirst();
		regions.removeLast();
		System.out.println("\nУдалили первый и последний регион в списке:");
		regions.forEach(System.out::println);
	}
}
