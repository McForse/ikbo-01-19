package ru.mirea.pr12.exercise2;

public class AddressTest {

	public static void main(String[] args) {
		System.out.println(new Address("Россия, Москва, Москва, пр. Вернадского, 78, 1"));
		System.out.println(new Address("Россия, Москва, Москва, пр. Вернадского, 86, 1"));
		System.out.println(new Address("Россия, Москва, Москва, Малая Пироговская, 1c5, 1"));
		System.out.println(new Address("Россия, Москва, Москва, Стромынка, 20, 1"));

		System.out.println(new Address("Россия, Москва, Москва, пр. Вернадского, 78, 1", ","));
		System.out.println(new Address("Россия; Москва; Москва; пр. Вернадского; 86; 1", ";"));
		System.out.println(new Address("Россия. Москва. Москва. Малая Пироговская. 1c5. 1", "."));
		System.out.println(new Address("Россия - Москва - Москва - Стромынка - 20 - 1", "-"));
	}
}
