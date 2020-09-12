package ru.mirea.pr7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InteractiveGame extends JFrame {
	private final DequeGame game;

	private JLabel card1, card2, left1, left2, result;
	private JButton nextButton;

	public InteractiveGame() {
		List<Integer> digits = IntStream.range(0,10).boxed().collect(Collectors.toList());
		Collections.shuffle(digits);
		this.game = new DequeGame(new ArrayDeque<>(digits.subList(0, 4)), new ArrayDeque<>(digits.subList(5, 9)));
		initComponents();
	}

	private void initComponents() {
		setTitle("Drunkard game");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 300);
		setMinimumSize(new Dimension(500, 300));
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
		result = new JLabel("", SwingConstants.CENTER);
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

	private void next() {
		if (!game.isEnd()) {
			game.nextMove();
			card1.setText(String.valueOf(game.getPlayer1Card()).replace("null", "Empty"));
			card2.setText(String.valueOf(game.getPlayer2Card()).replace("null", "Empty"));
			left1.setText("Cards left: " + game.getPlayer1DeckSize());
			left2.setText("Cards left: " + game.getPlayer2DeckSize());
		}

		if (game.isEnd()) {
			result.setText("Result: " + game.getResult());
			result.setVisible(true);
			nextButton.setEnabled(false);
		}
	}

	public static void main(String[] args) {
		new InteractiveGame().setVisible(true);
	}
}
