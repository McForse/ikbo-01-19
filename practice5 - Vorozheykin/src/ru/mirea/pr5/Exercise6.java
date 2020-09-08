package ru.mirea.pr5;

import java.util.Scanner;

/**
 * Проверка числа на простоту
 * Дано натуральное число n>1. Проверьте, является ли оно простым.
 * Программа должна вывести слово YES, если число простое и NO, если число
 * составное. Алгоритм должен иметь сложность O(logn).
 */
public class Exercise6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(isPrime(sc.nextInt()) ? "YES" : "NO");
	}

	public static boolean isPrime(int x) {
		return check(x, 2);
	}

	private static boolean check(int x, int divider) {
		if (x < 2) return false;
		else if (x == 2) return true;
		else if (x % divider == 0) return false;
		else if (x / 2 > divider) return check(x, divider + 1);
		else return true;
	}
}
