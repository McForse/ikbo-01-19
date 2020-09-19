package ru.mirea.lab10;

import java.util.Arrays;

public class Exercise2and3 {

	public static void main(String[] args) {
		GenericArray<Integer> integerArray = new GenericArray<>(5);
		integerArray.add(1);
		integerArray.add(2);
		integerArray.add(3);
		integerArray.add(4);
		integerArray.add(5);
		System.out.println(integerArray);

		GenericArray<String> stringArray = new GenericArray<>(5);
		stringArray.add("one");
		stringArray.add("two");
		stringArray.add("three");
		stringArray.add("four");
		stringArray.add("five");
		System.out.println(stringArray.at(4));
	}

	static class GenericArray<E> {
		private final E[] data;
		private final int capacity;
		private int size;

		@SuppressWarnings("unchecked")
		public GenericArray(int capacity) {
			if (capacity < 0) throw new IllegalArgumentException("Capacity cannot be negative");
			this.capacity = capacity;
			data = (E[]) new Object[capacity];
		}

		public void add(E item) {
			try {
				data[size++] = item;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Out of bounds of array");
			}
		}

		public E at(int index) {
			if (index < 0) throw new IllegalArgumentException("Index cannot be negative");
			else if (index > capacity - 1) throw new IllegalArgumentException("Index out of bounds");

			return data[index];
		}

		@Override
		public String toString() {
			return Arrays.toString(data);
		}
	}
}
