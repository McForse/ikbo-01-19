package ru.mirea.pr6.exercise2;

public class Student implements Comparable<Student> {
	private final long id;
	private final int gpa;

	public Student(long id, int gpa) {
		this.id = id;
		this.gpa = gpa;
	}

	public long getId() {
		return id;
	}

	public int getGpa() {
		return gpa;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", gpa=" + gpa +
				'}';
	}

	@Override
	public int compareTo(Student s) {
		return Integer.compare(s.getGpa(), gpa);
	}
}
