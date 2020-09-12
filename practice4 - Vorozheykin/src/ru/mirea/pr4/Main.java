package ru.mirea.pr4;

public class Main {

	public static void main(String[] args) {
		Team milan = new Team("AC Milan");
		Team madrid = new Team("Real Madrid");

		new MatchResults(milan, madrid)
				.setVisible(true);
	}
}
