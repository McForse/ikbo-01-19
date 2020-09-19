package ru.mirea.lab9.exercise5;

public class Exercise5 {

	public static void main(String[] args) {
		// Добавить конструкцию try-catch в метод getDetails не является
		// подходящим способом для обработки исключения NullPointerException.
		// Так как в нём не производится никаких операций, логичнее осуществлять
		// обработку в другом методе, в котором непосредственно происходит вызов getDetails.
		// В данном случае это будет метод printMessage.
		ThrowsDemo throwsDemo = new ThrowsDemo();

		throwsDemo.printMessage("qwerty");
		throwsDemo.printMessage(null);
	}
}
