package ru.mirea.pr9.exercise2;

public class Student implements Comparable<Student> {
	private final String firstName;
	private final String secondName;
	private final String middleName;
	private final int gpa;

	public Student(String firstName, String secondName, String middleName, int gpa) throws EmptyStringException {
		if (firstName.isEmpty()) throw new EmptyStringException("First name");
		else if (secondName.isEmpty()) throw new EmptyStringException("Second name");
		else if (middleName.isEmpty()) throw new EmptyStringException("Middle name");
		this.firstName = firstName;
		this.secondName = secondName;
		this.middleName = middleName;
		this.gpa = gpa;
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

	public int getGpa() {
		return gpa;
	}

	@Override
	public int compareTo(Student o) {
		return Integer.compare(o.getGpa(), gpa);
	}

	@Override
	public String toString() {
		return "Student{" +
				"firstName='" + firstName + '\'' +
				", secondName='" + secondName + '\'' +
				", middleName='" + middleName + '\'' +
				", gpa=" + gpa +
				'}';
	}
}
