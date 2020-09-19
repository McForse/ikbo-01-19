package ru.mirea.lab9.exercise3;

import java.util.Scanner;

public class Exception3 {

	public void exceptionDemo() {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Enter an integer ");
		String intString = myScanner.next();

		// Перехват всех возможных исключений
		try {
			int i = Integer.parseInt(intString);
			System.out.println(2 / i);
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}
}
