package ru.mirea.lab1;

public class Example1 {

	public static void main(String[] args) {
		int[] array = {1, 4, 10, 3, 7, 5, 2, 6, 9, 8};
		int sum = 0;

		for (int item : array) {
			sum += item;
		}

		System.out.println("Sum of array numbers using a for loop: " + sum);

		int i = 0;
		sum = 0;

		while (i < array.length) {
			sum += array[i++];
		}

		System.out.println("Sum of array numbers using a while loop: " + sum);

		i = 0;
		sum = 0;

		do {
			sum += array[i++];
		} while (i < array.length);

		System.out.println("Sum of array numbers using a do while loop: " + sum);
	}
}
