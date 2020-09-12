package ru.mirea.pr7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;

public class InteractiveGame extends JFrame {
	private final DequeGame game;

	private JLabel card1, card2, left1, left2, result;
	private JButton nextButton;

	public InteractiveGame() {
		Deque<Integer> deck1 = generateDeck();
		Deque<Integer> deck2 = generateDeck(deck1);
		this.game = new DequeGame(deck1, deck2);
		initComponents();
	}

	private void initComponents() {
		setSize(500, 300);
		setTitle("Drunkard game");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(1, 3));
		getRootPane().setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		JPanel[] panels = new JPanel[3];

		for (int i = 0; i < panels.length; i++) {
			panels[i] = new JPanel();
			panels[i].setLayout(new BorderLayout());
			add(panels[i]);
		}

		card1 = new JLabel(String.valueOf(game.getPlayer1Card()), SwingConstants.CENTER);
		card2 = new JLabel(String.valueOf(game.getPlayer2Card()), SwingConstants.CENTER);
		left1 = new JLabel("Cards left: " + game.getPlayer1DeckSize(), SwingConstants.CENTER);
		left2 = new JLabel("Cards left: " + game.getPlayer2DeckSize(), SwingConstants.CENTER);
		result = new JLabel();
		result.setVisible(false);
		card1.setFont(new Font("Verdana", Font.BOLD, 36));
		card2.setFont(new Font("Verdana", Font.BOLD, 36));
		nextButton = new JButton("Next");

		nextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				next();
			}
		});

		panels[0].add(card1, BorderLayout.CENTER);
		panels[0].add(left1, BorderLayout.SOUTH);
		panels[1].add(result, BorderLayout.NORTH);
		panels[1].add(nextButton, BorderLayout.CENTER);
		panels[2].add(card2, BorderLayout.CENTER);
		panels[2].add(left2, BorderLayout.SOUTH);
	}

	private Deque<Integer> generateDeck() {
		Deque<Integer> deck = new ArrayDeque<>();
		boolean[] digits = new boolean[10];
		Random random = new Random(System.currentTimeMillis());

		while (deck.size() != 5) {
			int digit = random.nextInt(10);

			if (!digits[digit]) {
				deck.add(digit);
				digits[digit] = true;
			}
		}

		return deck;
	}

	private Deque<Integer> generateDeck(Deque<Integer> existDeck) {
		Deque<Integer> deck = new ArrayDeque<>();

		for (int i = 0; i < 10; i++) {
			if (!existDeck.contains(i)) {
				deck.add(i);
			}
		}

		return deck;
	}

	private void next() {
		if (!game.isEnd()) {
			game.nextMove();
			card1.setText(String.valueOf(game.getPlayer1Card()));
			card2.setText(String.valueOf(game.getPlayer2Card()));
			left1.setText("Cards left: " + game.getPlayer1DeckSize());
			left2.setText("Cards left: " + game.getPlayer2DeckSize());
		}

		if (game.isEnd()) {
			result.setText(game.getResult());
			result.setVisible(true);
		}
	}

	public static void main(String[] args) {
		new InteractiveGame().setVisible(true);
	}
}
