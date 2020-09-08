package ru.mirea.pr5;

import java.util.Scanner;

/**
 * Разложение на множители
 * Дано натуральное число n>1. Выведите все простые множители этого
 * числа в порядке не убывания с учетом кратности. Алгоритм должен иметь
 * сложность O(logn)
 */
public class Exercise7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		factorization(sc.nextInt());
	}

	public static void factorization(int x) {
		factorization(x, 2);
	}

	/* First variant
	private static void factorization(int x, int divider) {
		if (divider > x / 2) return;

		for (int i = divider; i < 10; i++) {
			if (x % i == 0) {
				System.out.println(i);
				factorization(x / i, i);
				return;
			}
		}
	}
	*/

	private static void factorization(int x, int divider) {
		if (divider > x / 2) return;

		while (x % divider > 0) divider++;
		System.out.println(divider);
		factorization(x / divider, divider);
	}
}
