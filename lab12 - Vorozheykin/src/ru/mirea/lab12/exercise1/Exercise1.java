package ru.mirea.lab12.exercise1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pattern pattern = Pattern.compile("\\d+\\s?");
		System.out.println("Enter a line:");
		String[] words = pattern.split(sc.nextLine());
		System.out.println(Arrays.toString(words));
	}
}
