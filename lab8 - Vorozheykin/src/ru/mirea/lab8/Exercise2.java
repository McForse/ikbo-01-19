package ru.mirea.lab8;

import java.io.FileReader;
import java.io.IOException;

public class Exercise2 {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader(Exercise1.FILE_PATH);
			int c;
			System.out.println("Information from file: ");

			while ((c = reader.read()) != -1) {
				System.out.print((char) c);
			}

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
