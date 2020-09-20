package ru.mirea.pr9.exercise1;

public class Client {
	private final String firstName;
	private final String secondName;
	private final String middleName;
	private final String inn;

	public Client(String firstName, String secondName, String middleName, String inn) throws IncorrectInnException {
		checkInn(inn);
		this.firstName = firstName;
		this.secondName = secondName;
		this.middleName = middleName;
		this.inn = inn;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getInn() {
		return inn;
	}

	private void checkInn(String inn) throws IncorrectInnException {
		if (!inn.matches("^\\d{12}")) {
			throw new IncorrectInnException();
		}
	}

	@Override
	public String toString() {
		return "Client{" +
				"firstName='" + firstName + '\'' +
				", secondName='" + secondName + '\'' +
				", middleName='" + middleName + '\'' +
				", inn='" + inn + '\'' +
				'}';
	}
}
