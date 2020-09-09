package ru.mirea.pr6.exercise3;

import ru.mirea.pr6.exercise1.Student;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeSortTest {

	public static void main(String[] args) {
		Student[] array1 = new Student[10];
		Student[] array2 = new Student[10];

		for (int i = 0; i < array1.length; i++) {
			array1[i] = new Student((long) (Math.random() * 100));
			array2[i] = new Student((long) (Math.random() * 100));
		}

		System.out.println("Students array 1:");
		Arrays.stream(array1).forEach(System.out::println);

		System.out.println("\nStudents array 2:");
		Arrays.stream(array2).forEach(System.out::println);

		Student[] concatArray =
				Stream.concat(
						Stream.of(array1),
						Stream.of(array2)
				)
				.toArray(Student[]::new);

		System.out.println("\nAfter sorting by id:");
		Arrays.stream(sortArray(concatArray)).forEach(System.out::println);
	}

	public static Student[] sortArray(Student[] arrayA) {
		if (arrayA == null) {
			return null;
		}

		if (arrayA.length < 2) {
			return arrayA;
		}

		Student[] arrayB = new Student[arrayA.length / 2];
		System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);

		Student[] arrayC = new Student[arrayA.length - arrayA.length / 2];
		System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);

		arrayB = sortArray(arrayB);
		arrayC = sortArray(arrayC);

		return mergeArray(arrayB, arrayC);
	}

	public static Student[] mergeArray(Student[] arrayA, Student[] arrayB) {
		Student[] arrayC = new Student[arrayA.length + arrayB.length];
		int positionA = 0, positionB = 0;

		for (int i = 0; i < arrayC.length; i++) {
			if (positionA == arrayA.length){
				arrayC[i] = arrayB[positionB];
				positionB++;
			} else if (positionB == arrayB.length) {
				arrayC[i] = arrayA[positionA];
				positionA++;
			} else if (arrayA[positionA].compareTo(arrayB[positionB]) < 0) {
				arrayC[i] = arrayA[positionA];
				positionA++;
			} else {
				arrayC[i] = arrayB[positionB];
				positionB++;
			}
		}

		return arrayC;
	}
}
