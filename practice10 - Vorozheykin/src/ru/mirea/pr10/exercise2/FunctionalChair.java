package ru.mirea.pr10.exercise2;

public class FunctionalChair implements Chair {
	public int sum(int a, int b) {
		return a + b;
	}

	@Override
	public String toString() {
		return "FunctionalChair";
	}
}
