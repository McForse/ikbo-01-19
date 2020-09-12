package ru.mirea.lab8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileApp {
	public final static String FILE_PATH = "text.txt";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Exercise 1
		System.out.println("Enter text to write to file:");
		write(sc.nextLine(), false);

		// Exercise 2
		System.out.println("\nInformation from file:");
		read();

		// Exercise 3
		System.out.println("\nEnter text to overwrite to file:");
		write(sc.nextLine(), false);
		System.out.println("\nInformation from file:");
		read();

		// Exercise 4
		System.out.println("\nEnter the text to add to the file:");
		write(sc.nextLine(), true);
		System.out.println("\nInformation from file:");
		read();
	}

	private static void write(String text, boolean append) {
		try {
			FileWriter writer = new FileWriter(FILE_PATH, append);
			writer.write(text);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void read() {
		try {
			FileReader reader = new FileReader(FILE_PATH);
			int c;

			while ((c = reader.read()) != -1) {
				System.out.print((char) c);
			}

			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
