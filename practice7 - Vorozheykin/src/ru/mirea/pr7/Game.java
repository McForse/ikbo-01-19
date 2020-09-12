package ru.mirea.pr7;

import java.util.Scanner;

public abstract class Game<T> implements Gameable<T> {
	protected T deck1;
	protected T deck2;

	private int i;

	public Game() {
		Scanner sc = new Scanner(System.in);
		deck1 = setPlayerDeck(sc);
		deck2 = setPlayerDeck(sc);
	}

	public Game(T deck1, T deck2) {
		this.deck1 = deck1;
		this.deck2 = deck2;
	}

	public void startAuto() {
		while (!isEnd()) {
			nextMove();
		}
	}

	public void nextMove() {
		if (isEnd()) return;
		int card1 = getPlayer1Card();
		int card2 = getPlayer2Card();

		if (card1 == 0 && card2 == 9) {
			giveCard(deck2, deck1);
		} else if (card2 == 0 && card1 == 9) {
			giveCard(deck1, deck2);
		} else if (card1 > card2) {
			giveCard(deck2, deck1);
		} else if (card2 > card1) {
			giveCard(deck1, deck2);
		}

		i++;
	}

	public boolean isEnd() {
		return isPlayer1DeckEmpty() || isPlayer2DeckEmpty() || i >= 106;
	}

	public String getResult() {
		if (isEnd()) {
			return i == 106 ? "botva" : (isPlayer2DeckEmpty() ? "first" : "second") + " " + i;
		} else {
			return "Game is not end";
		}
	}

}
