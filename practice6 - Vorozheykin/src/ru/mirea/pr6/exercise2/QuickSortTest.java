package ru.mirea.pr6.exercise2;

import java.util.Arrays;

public class QuickSortTest {

	public static void main(String[] args) {
		Student[] students = new Student[10];

		System.out.println("Students array:");
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student((long) (Math.random() * 100), (int) (Math.random() * 5));
			System.out.println(students[i]);
		}

		quickSort(students, 0, students.length - 1);

		System.out.println("\nAfter sorting by gpa:");
		Arrays.stream(students).forEach(System.out::println);
	}

	public static <T extends Comparable<T>> void quickSort(T[] array, int left, int right) {
		T x = array[(left + right) / 2];
		int i = left;
		int j = right;

		while (i <= j) {
			while (array[i].compareTo(x) < 0) i++;
			while (array[j].compareTo(x) > 0) j--;

			if (i <= j) {
				T temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}
		}

		if (i < right) quickSort(array, i, right);
		if (left < j) quickSort(array, left, j);
	}
}
