package ru.mirea.lab1;

import java.util.Arrays;

public class Example4 {

	public static void main(String[] args) {
		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			// Random number from 0 to 100
			array[i] = (int) (Math.random() * 100);
		}

		System.out.println("Array before sorting:");

		for (int item : array) {
			System.out.print(item + " ");
		}

		Arrays.sort(array);
		System.out.println("\nArray after sorting:");

		for (int item : array) {
			System.out.print(item + " ");
		}
	}
}
