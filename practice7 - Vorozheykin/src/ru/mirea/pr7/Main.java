package ru.mirea.pr7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Game game = new DequeueGame(sc);
		game.start();
		game.printResult();
	}
}
