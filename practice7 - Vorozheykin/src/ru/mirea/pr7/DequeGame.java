package ru.mirea.pr7;

import java.util.*;

public class DequeGame extends Game<Deque<Integer>> {

	public DequeGame(Scanner sc) {
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
		return deck1.peekLast();
	}

	@Override
	public Integer getPlayer2Card() {
		return deck2.peekLast();
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
		to.offerFirst(to.peekLast());
		to.removeLast();
		to.offerFirst(from.peekLast());
		from.removeLast();
	}
}
