package ru.mirea.lab9.exercise4;

import java.util.Scanner;

public class Exception4 {

	public void exceptionDemo() {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Enter an integer ");
		String intString = myScanner.next();

		try {
			int i = Integer.parseInt(intString);
			System.out.println(2 / i);
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("Finally block");
		}
	}
}
