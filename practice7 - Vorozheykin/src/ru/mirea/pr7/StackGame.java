package ru.mirea.pr7;

import java.util.Scanner;
import java.util.Stack;

public class StackGame extends Game<Stack<Integer>> {

	@Override
	public Stack<Integer> setPlayerDeck(Scanner sc) {
		String cards = sc.nextLine();
		Stack<Integer> deck = new Stack<>();

		for (int i = 0; i < cards.length(); i++) {
			deck.push(cards.charAt(i) - '0');
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
	public void giveCard(Stack<Integer> from, Stack<Integer> to) {
		to.insertElementAt(to.peek(), 0);
		to.pop();
		to.insertElementAt(from.peek(), 0);
		from.pop();
	}
}
