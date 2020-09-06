package ru.mirea.lab1;

public class Exercise5 {

	public static void main(String[] args) {
		for (int i = 0; i <= 20; i++) {
			System.out.format("%d! = %d\n", i, factorial(i));
		}
	}

	public static long factorial(int x) {
		if (x < 0) throw new IllegalArgumentException("Function defined on the set of non-negative numbers");
		long result = 1;

		for (int i = 1; i <= x; i++) {
			result *= i;
		}

		return result;
	}
}
