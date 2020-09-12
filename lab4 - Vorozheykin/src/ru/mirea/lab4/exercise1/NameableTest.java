package ru.mirea.lab4.exercise1;

public class NameableTest {

    public static void main(String[] args) {
		Nameable car = new Car("Tesla", "Model S");
		Nameable book = new Book("Michael Bulgakov", "Master and Margarita");
		Nameable dog = new Dog("Baron", "Poodle");

		System.out.println(car.getName());
		System.out.println(book.getName());
		System.out.println(dog.getName());
    }
}
