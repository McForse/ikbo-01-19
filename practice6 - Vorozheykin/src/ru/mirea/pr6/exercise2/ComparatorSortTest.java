package ru.mirea.pr6.exercise2;

import java.util.Arrays;

public class ComparatorSortTest {

	public static void main(String[] args) {
		Student[] students = new Student[10];

		System.out.println("Students array:");
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student((long) (Math.random() * 100), (int) (Math.random() * 5));
			System.out.println(students[i]);
		}

		Arrays.sort(students, new SortingStudentsByGpa());

		System.out.println("\nAfter sorting by gpa:");
		Arrays.stream(students).forEach(System.out::println);
	}
}
