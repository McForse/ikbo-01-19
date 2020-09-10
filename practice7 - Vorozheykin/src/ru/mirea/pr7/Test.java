package ru.mirea.pr7;

import java.util.Scanner;
import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> deck1 = getPlayerDeck(sc);
		Stack<Integer> deck2 = getPlayerDeck(sc);
		int i = 0, card1, card2;

		while (!deck1.isEmpty() && !deck2.isEmpty() && ++i < 106) {
			card1 = deck1.peek();
			card2 = deck2.peek();

			if (card1 == 0) {
				giveCard(deck2, deck1);
				continue;
			} else if (card2 == 0) {
				giveCard(deck1, deck2);
				continue;
			}

			if (card1 > card2) {
				giveCard(deck2, deck1);
				deck1.push(card2);
				deck2.pop();
			} else if (card2 > card1) {
				giveCard(deck1, deck2);
			}
		}

		System.out.println(i == 106 ? "botva" : (deck2.isEmpty() ? "first" : "second")  + " " + i);
	}

	private static Stack<Integer> getPlayerDeck(Scanner sc) {
		String cards = sc.nextLine();
		Stack<Integer> deck = new Stack<>();

		for (int i = 0; i < cards.length(); i++) {
			deck.push(cards.charAt(i) - '0');
		}

		return deck;
	}

	private static void giveCard(Stack<Integer> from, Stack<Integer> to) {
		to.push(from.peek());
		from.pop();
	}
}
