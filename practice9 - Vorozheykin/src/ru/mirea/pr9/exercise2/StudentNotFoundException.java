package ru.mirea.pr9.exercise2;

public class StudentNotFoundException extends Exception {
	public StudentNotFoundException(String student) {
		super(student + " not found");
	}
}
