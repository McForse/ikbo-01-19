package ru.mirea.pr8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This is the Main class for testing wait lists
 * @author Vorozhekin D.
 */
public class Main {

    public static void main(String[] args) {
    	// Test BoundedWaitList
		WaitList<Integer> boundedWaitList = new BoundedWaitList<>(10);
		for (int i = 0; i < 10; i++) boundedWaitList.add((int) (Math.random() * 100));
		System.out.println(boundedWaitList);
		try {
			boundedWaitList.add(10);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of bounds of boundedWaitList");
		}
		System.out.println("Remove first: " + boundedWaitList.remove());
		System.out.println(boundedWaitList);
		System.out.println("Contains 5: " + boundedWaitList.contains(5));
		System.out.println("Contains all [1, 2]: " + boundedWaitList.containsAll(Arrays.asList(1, 2)));
		System.out.println("Is empty: " + boundedWaitList.isEmpty());

		// Test UnfairWaitList
		UnfairWaitList<String> unfairWaitList = new UnfairWaitList<>();
		System.out.println("\n" + unfairWaitList);
		System.out.println("Is empty: " + unfairWaitList.isEmpty());
		unfairWaitList.add("one");
		unfairWaitList.add("two");
		unfairWaitList.add("three");
		System.out.println(unfairWaitList);
		System.out.println("Is empty: " + unfairWaitList.isEmpty());
		System.out.println("Remove one (cannot)");
		unfairWaitList.remove("one");
		System.out.println(unfairWaitList);
		System.out.println("Remove two");
		unfairWaitList.remove("two");
		System.out.println(unfairWaitList);
		System.out.println("Contains two: " + unfairWaitList.contains("two"));
		System.out.println("Contains all [one, two]: " + unfairWaitList.containsAll(Arrays.asList("one", "two")));
		System.out.println("Move to back one");
		unfairWaitList.moveToBack("one");
		System.out.println(unfairWaitList);
    }
}
