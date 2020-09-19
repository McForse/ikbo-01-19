package ru.mirea.lab9.exercise7;

public class Exercise7 {

	public static void main(String[] args) {
		ThrowsDemo throwsDemo = new ThrowsDemo();

		try {
			throwsDemo.getKey();
		} catch (Exception e) {
			System.out.print("You entered an empty key");
		}
	}
}
