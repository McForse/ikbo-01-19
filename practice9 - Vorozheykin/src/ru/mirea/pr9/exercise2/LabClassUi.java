package ru.mirea.pr9.exercise2;

import java.util.List;

public interface LabClassUi {
	List<Student> getStudents();
	void addStudent(Student student) throws EmptyStringException;
	void sortBySecondName();
	void sortByGpa();
	Student findStudentByName(String firstName, String secondName, String middleName) throws StudentNotFoundException;
}
