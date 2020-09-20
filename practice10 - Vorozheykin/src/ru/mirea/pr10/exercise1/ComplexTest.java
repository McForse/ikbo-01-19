package ru.mirea.pr10.exercise1;

public class ComplexTest {

	public static void main(String[] args) {
		ComplexAbstractFactory factory = new ConcreteFactory();
		Complex complex = factory.createComplex(1, 2);
		System.out.println(complex);
	}
}
