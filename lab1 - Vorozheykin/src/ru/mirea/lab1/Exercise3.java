package ru.mirea.lab1;

public class Exercise3 {

	public static void main(String[] args) {
		final int numbersCount = 10;

		for (int i = 1; i <= numbersCount; i++) {
			if (i == 1) {
				System.out.println(i);
			} else {
				System.out.format("1/%d\n", i);
			}
		}
	}
}
