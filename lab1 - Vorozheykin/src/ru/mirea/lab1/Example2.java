package ru.mirea.lab1;

public class Example2 {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("[Error] No command line arguments");
		} else {
			for (String arg : args) {
				System.out.println(arg);
			}
		}
	}
}
