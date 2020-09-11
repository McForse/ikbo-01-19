package ru.mirea.pr7;

import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;

import java.util.Scanner;

public class DoubleListGame extends Game<DoubleList> {

	public DoubleListGame(Scanner sc) {
		super(sc);
	}

	@Override
	public DoubleList setPlayerDeck(Scanner sc) {
		String cards = sc.nextLine();
		DoubleList deck = new DoubleArrayList();

		for (int i = 0; i < cards.length(); i++) {
			deck.add(cards.charAt(i) - '0');
		}

		return deck;
	}

	@Override
	public Integer getPlayer1Card() {
		return (int) deck1.getDouble(0);
	}

	@Override
	public Integer getPlayer2Card() {
		return (int) deck2.getDouble(0);
	}

	@Override
	public boolean isPlayer1DeckEmpty() {
		return deck1.isEmpty();
	}

	@Override
	public boolean isPlayer2DeckEmpty() {
		return deck2.isEmpty();
	}

	@Override
	public void giveCard(DoubleList from, DoubleList to) {
		to.add(to.getDouble(0));
		to.removeDouble(0);
		to.add(from.getDouble(0));
		from.removeDouble(0);

	}
}
