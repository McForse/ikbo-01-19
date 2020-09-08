package ru.mirea.pr5;

import java.util.Scanner;

/**
 * Палиндром
 * Дано слово, состоящее только из строчных латинских букв. Проверьте,
 * является ли это слово палиндромом. Выведите YES или NO.
 */
public class Exercise8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(isPalindrome(sc.nextLine()) ? "YES" : "NO");
	}

	// For numbers
	public static boolean isPalindrome(int x) {
		if (x / 10 > 0) {
			int d = 10;
			while (x / d > 9) d *= 10;

			int firstDigit = x / d;

			if (firstDigit == x % 10) {
				return isPalindrome((x - firstDigit * d) / 10);
			} else {
				return false;
			}
		} else {
			return true;
		}
	}

	// For strings
	public static boolean isPalindrome(String str) {
		if (str.length() > 1) {
			if (str.charAt(0) == str.charAt(str.length() - 1)) {
				if (str.length() == 2) {
					return true;
				}

				return isPalindrome(str.substring(1, str.length() - 1));
			} else {
				return false;
			}
		} else {
			return true;
		}
	}
}
