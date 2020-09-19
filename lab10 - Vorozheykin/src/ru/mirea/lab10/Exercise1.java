package ru.mirea.lab10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise1 {

    public static void main(String[] args) {
    	String[] stringArray = {"qwerty", "asdfgh", "zxcvbn"};
		int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

		System.out.println("Strings: " + convertToList(stringArray));
		System.out.println("int: " + convertToList(Arrays.stream(intArray).boxed().toArray(Integer[]::new)));
    }

    public static <T> List<T> convertToList(T[] array) {
    	return new ArrayList<>(Arrays.asList(array));
	}
}
