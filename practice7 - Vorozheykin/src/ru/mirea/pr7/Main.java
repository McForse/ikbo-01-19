package ru.mirea.pr7;

public class Main {

	public static void main(String[] args) {
		DoubleListGame game = new DoubleListGame();
		game.startAuto();
		System.out.println(game.getResult());
	}
}
