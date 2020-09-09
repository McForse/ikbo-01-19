package ru.mirea.pr6.exercise2;

import java.util.Comparator;

public class SortingStudentsByGpa implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return Integer.compare(s2.getGpa(), s1.getGpa());
	}
}
