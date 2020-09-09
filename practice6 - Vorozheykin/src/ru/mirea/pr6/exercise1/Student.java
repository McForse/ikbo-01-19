package ru.mirea.pr6.exercise1;

public class Student implements Comparable<Student> {
	private final long id;

	public Student(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				'}';
	}

	@Override
	public int compareTo(Student s) {
		return Long.compare(id, s.getId());
	}
}
