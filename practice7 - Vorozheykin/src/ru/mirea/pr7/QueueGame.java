package ru.mirea.pr7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueGame extends Game<Queue<Integer>> {

	@Override
	public Queue<Integer> setPlayerDeck(Scanner sc) {
		String cards = sc.nextLine();
		Queue<Integer> deck = new LinkedList<>();

		for (int i = 0; i < cards.length(); i++) {
			deck.offer(cards.charAt(i) - '0');
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
	public void giveCard(Queue<Integer> from, Queue<Integer> to) {
		to.offer(to.peek());
		to.remove();
		to.offer(from.peek());
		from.remove();
	}
}
