package ru.mirea.pr6.exercise1;

import java.util.Arrays;

public class InsertingSortTest {

    public static void main(String[] args) {
		Student[] iDNumber = new Student[10];

		System.out.println("iDNumber array:");
		for (int i = 0; i < iDNumber.length; i++) {
			iDNumber[i] = new Student((long) (Math.random() * 100));
			System.out.println(iDNumber[i]);
		}

		insertionSort(iDNumber);

		System.out.println("\nAfter sorting by id:");
		Arrays.stream(iDNumber).forEach(System.out::println);
    }

    public static void insertionSort(Student[] array) {
    	int i;
    	Student key;

		for (int j = 1; j < array.length; j++) {
			key = array[j];
			i = j - 1;

			while (i >= 0 && key.compareTo(array[i]) < 0) {
				array[i + 1] = array[i];
				i--;
			}

			array[i + 1] = key;
		}
	}
}
