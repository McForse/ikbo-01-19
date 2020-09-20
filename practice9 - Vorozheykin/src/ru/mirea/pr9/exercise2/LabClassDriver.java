package ru.mirea.pr9.exercise2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LabClassDriver implements LabClassUi {
	private List<Student> students;

	public LabClassDriver() {
		this.students = new ArrayList<>();
	}

	@Override
	public List<Student> getStudents() {
		return students;
	}

	@Override
	public void addStudent(Student student) {
		students.add(student);
	}

	@Override
	public void sortBySecondName() {
		students = students.stream()
				.sorted(Comparator.comparing(Student::getSecondName))
				.collect(Collectors.toList());
	}

	@Override
	public void sortByGpa() {
		students = students.stream()
				.sorted()
				.collect(Collectors.toList());
	}

	@Override
	public Student findStudentByName(String firstName, String secondName, String middleName) throws StudentNotFoundException {
		return students.stream()
				.filter(s -> firstName.equals(s.getFirstName()) &&
						secondName.equals(s.getSecondName()) &&
						middleName.equals(s.getMiddleName()))
				.findFirst()
				.orElseThrow(() -> new StudentNotFoundException(firstName + " " + secondName + " " + middleName));
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		students.forEach(s -> stringBuilder.append(s).append('\n'));
		return stringBuilder.toString();
	}
}
