package ru.mirea.pr7;

import java.util.*;

public class DequeueGame extends Game<Deque<Integer>> {

	public DequeueGame(Scanner sc) {
		super(sc);
	}

	@Override
	public Deque<Integer> setPlayerDeck(Scanner sc) {
		String cards = sc.nextLine();
		Deque<Integer> deck = new ArrayDeque<>();

		for (int i = 0; i < cards.length(); i++) {
			deck.offerLast(cards.charAt(i) - '0');
		}

		return deck;
	}

	@Override
	public Integer getPlayer1Card() {
		return deck1.peek();
	}

	@Override
	public Integer getPlayer2Card() {
		return deck2.peek();
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
	public void giveCard(Deque<Integer> from, Deque<Integer> to) {
		to.push(from.peek());
		from.removeLast();
	}
}
