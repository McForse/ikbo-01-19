package ru.mirea.lab12.exercise4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
		System.out.println("Enter email:");
		Matcher matcher = pattern.matcher(scanner.nextLine());
		System.out.println(matcher.matches());
	}
}
