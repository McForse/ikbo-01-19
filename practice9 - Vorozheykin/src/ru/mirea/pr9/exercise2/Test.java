package ru.mirea.pr9.exercise2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws EmptyStringException {
		LabClassUi labClassUi = new LabClass().getLabClassUi();
		labClassUi.addStudent(new Student("Elon", "Musk", "Reeve", 4));
		labClassUi.addStudent(new Student("Mark", "Zuckerberg", "Elliot", 3));
		labClassUi.addStudent(new Student("Jeffrey", "Bezos", "Preston", 4));
		labClassUi.addStudent(new Student("Steven", "Jobs", "Paul", 5));
		System.out.println(labClassUi);
		labClassUi.sortBySecondName();
		System.out.println("Sorted by second name:\n" + labClassUi);
		labClassUi.sortByGpa();
		System.out.println("Sorted by gpa:\n" + labClassUi);

		System.out.print("Enter student's full name: ");
		Scanner sc = new Scanner(System.in);
		String student = sc.nextLine();
		String[] fullName = student.split(" ");
		try {
			if (fullName.length == 3) {
				System.out.println(labClassUi.findStudentByName(fullName[0], fullName[1], fullName[2]));
			} else throw new StudentNotFoundException(student);
		} catch (StudentNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
