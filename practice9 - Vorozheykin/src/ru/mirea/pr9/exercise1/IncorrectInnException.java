package ru.mirea.pr9.exercise1;

public class IncorrectInnException extends Exception {

	public IncorrectInnException() {
		super("INN must contain 12 digits");
	}

	public IncorrectInnException(String message) {
		super(message);
	}
}
