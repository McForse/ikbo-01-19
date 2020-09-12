package ru.mirea.lab8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise1 {
	public final static String FILE_PATH = "text.txt";

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter text to write to file: ");
		String text = sc.nextLine();

		try {
			FileWriter writer = new FileWriter(FILE_PATH);
			writer.write(text);
			writer.flush();
			writer.close();
			System.out.println("Information has been successfully written to the file");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
