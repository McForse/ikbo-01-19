package ru.mirea.pr12.exercise1;

public class Person {
	private final String secondName;
	private final String firstName;
	private final String patronymic;

	public Person(String secondName, String firstName, String patronymic) {
		this.secondName = secondName;
		this.firstName = firstName;
		this.patronymic = patronymic;
	}

	public String getFullName() {
		return new StringBuilder(secondName)
				.append(' ')
				.append(firstName != null && !firstName.isEmpty() ? firstName.charAt(0) + ".": "")
				.append(patronymic != null && !patronymic.isEmpty() ? patronymic.charAt(0) + ".": "")
				.toString();
	}
}
