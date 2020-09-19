package ru.mirea.lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class GuessingGame extends JFrame {
	private JTextField textField;
	private JButton guessButton, resetButton;
	private JLabel result;
	private int number;
	private int attempts;

	public GuessingGame() {
		initComponents();
	}

	private void initComponents() {
		setTitle("Guessing game");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(300, 200));
		getRootPane().setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		number = new Random(System.currentTimeMillis()).nextInt(20);
		JLabel info = new JLabel("Guess number be between 0 and 20");
		textField = new JTextField(2);
		guessButton = new JButton("Guess");
		guessButton.addMouseListener(new GuessButtonListener());
		result = new JLabel("Attempts left: " + (3 - attempts));
		resetButton = new JButton("Reset");
		resetButton.setVisible(false);
		resetButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				resetGame();
			}
		});

		setLayout(new GridBagLayout());
		JPanel gui = new JPanel();
		GroupLayout layout = new GroupLayout(gui);
		gui.setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);

		layout.setHorizontalGroup(
				layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
								.addComponent(info)
								.addComponent(textField)
								.addGroup(layout.createSequentialGroup()
										.addComponent(guessButton)
										.addComponent(resetButton))
								.addComponent(result)

						));
		layout.setVerticalGroup(
				layout.createSequentialGroup()
						.addGroup(layout.createSequentialGroup()
								.addComponent(info)
								.addComponent(textField)
								.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(guessButton)
										.addComponent(resetButton))
								.addComponent(result)
						));

		add(gui);
	}

	private class GuessButtonListener extends MouseAdapter {
		@Override
		public void mouseReleased(MouseEvent e) {
			try {
				int answer = Integer.parseInt(textField.getText());

				if (answer < 0 || answer > 20) {
					JOptionPane.showMessageDialog(null, "Number must be between 0 and 20!", "Alert", JOptionPane.ERROR_MESSAGE);
					return;
				}

				checkAnswer(answer);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Error in number!", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	private void checkAnswer(int answer) {
		attempts++;

		if (answer == number || attempts == 3) {
			result.setText(answer == number ? "You guessed" : "You lose! Number was " + number);
			textField.setEnabled(false);
			guessButton.setEnabled(false);
			resetButton.setVisible(true);
		} else if (answer > number) {
			result.setText("Your number is greater! Attempts left: " + (3 - attempts));
		} else {
			result.setText("Your number is less! Attempts left: " + (3 - attempts));
		}
	}

	private void resetGame() {
		number = new Random(System.currentTimeMillis()).nextInt(20);
		textField.setText("");
		textField.setEnabled(true);
		guessButton.setEnabled(true);
		resetButton.setVisible(false);
		attempts = 0;
		result.setText("Attempts left: " + (3 - attempts));
	}

	public static void main(String[] args) {
		new GuessingGame().setVisible(true);
    }
}
