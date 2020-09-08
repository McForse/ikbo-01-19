package ru.mirea.pr5;

import java.util.Scanner;

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
