package ru.mirea.lab9.exercise1;

public class Exercise1 {

	public static void main(String[] args) {
		// Листинг 1
		// При System.out.println(2 / 0); будет вызвано исключение java.lang.ArithmeticException
		// При System.out.println(2.0 / 0.0); будет выведено "Infinity"

		// Листинг 2
		// Перехватит ошибку и выведет "Attempted division by zero"
		Exception1 exception = new Exception1();
		exception.exceptionDemo();
	}
}
