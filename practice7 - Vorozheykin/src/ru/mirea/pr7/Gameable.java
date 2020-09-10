package ru.mirea.pr7;

import java.util.Scanner;

public interface Gameable<T> {
	T setPlayerDeck(Scanner sc);
	Integer getPlayer1Card();
	Integer getPlayer2Card();
	boolean isPlayer1DeckEmpty();
	boolean isPlayer2DeckEmpty();
	void giveCard(T from, T to);
}
