package ru.mirea.pr7;

import java.util.Scanner;

public abstract class Game<T> implements Gameable<T> {
	protected T deck1;
	protected T deck2;

	private int i;

	public Game(Scanner sc) {
		deck1 = setPlayerDeck(sc);
		deck2 = setPlayerDeck(sc);
	}

	public void start() {
		int card1, card2;

		while (!isPlayer1DeckEmpty() && !isPlayer2DeckEmpty() && ++i < 106) {
			card1 = getPlayer1Card();
			card2 = getPlayer2Card();

			if (card1 == 0 && card2 == 9) {
				giveCard(deck2, deck1);
				continue;
			} else if (card2 == 0 && card1 == 9) {
				giveCard(deck1, deck2);
				continue;
			}

			if (card1 > card2) {
				giveCard(deck2, deck1);
			} else if (card2 > card1) {
				giveCard(deck1, deck2);
			}
		}
	}

	public void printResult() {
		System.out.println(i == 106 ? "botva" : (isPlayer2DeckEmpty() ? "first" : "second")  + " " + i);
	}

}
