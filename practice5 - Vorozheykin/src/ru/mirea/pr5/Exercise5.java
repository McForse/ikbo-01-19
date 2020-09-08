package ru.mirea.pr5;

import java.util.Scanner;

/**
 * Сумма цифр числа
 * Дано натуральное число N. Вычислите сумму его цифр.
 * 46
 * При решении этой задачи нельзя использовать строки, списки, массивы (ну
 * и циклы, разумеется).
 */
public class Exercise5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(sumOfDigits(sc.nextInt()));
	}

	public static int sumOfDigits(int x) {
		if (x > 9) {
			return x % 10 + sumOfDigits(x / 10);
		} else {
			return x;
		}
	}
}
