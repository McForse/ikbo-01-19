package ru.mirea.lab7.exercise3;

import com.sun.tools.javac.util.List;

public class MyArrayListTest {

    public static void main(String[] args) {
		MyArrayList<Integer> array1 = new MyArrayList<>();
		array1.add(4);
		array1.add(6);
		array1.add(9);
		array1.add(10);
		array1.add(1);
		System.out.println(array1);

		// Expand check
		MyArrayList<Integer> array2 = new MyArrayList<>(2);
		array2.add(1);
		array2.add(2);
		array2.add(3);
		array2.add(4);
		array2.add(5);
		System.out.println(array2);

		MyArrayList<Integer> array3 = new MyArrayList<>(List.of(10, 9, 8, 7, 6));
		System.out.println(array3);

		MyArrayList<Integer> array4 = MyArrayList.of(2, 3, 4, 5, 6);
		System.out.println(array4);

		array4.add(2, 5);
		System.out.println("Added digit 5 to 2 index of the previous array:");
		System.out.println(array4);

		array1.addAll(array4);
		System.out.println("Added to the first array the last one was:");
		System.out.println(array1);

		array1.remove(array1.size() - 1);
		System.out.println("Removed the last element in the previous array:");
		System.out.println(array1);
    }
}
