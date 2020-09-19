package ru.mirea.lab9.exercise4;

public class Exercise4 {

	public static void main(String[] args) {
		// Блок finally выполнится независимо от того было исключение или нет
		Exception4 exception = new Exception4();
		exception.exceptionDemo();
	}
}
