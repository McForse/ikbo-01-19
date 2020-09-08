package ru.mirea.pr4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static javax.swing.GroupLayout.Alignment.*;

public class MatchResults extends JFrame {
	private final Team team1;
	private final Team team2;

	private JLabel resultLabel;
	private JLabel lastScorerLabel;
	private JLabel winnerLabel;

	public MatchResults(Team team1, Team team2) {
		this.team1 = team1;
		this.team2 = team2;

		initComponents();
	}

	private void initComponents() {
		JButton team1Button = new JButton(team1.getName());
		JButton team2Button = new JButton(team2.getName());
		resultLabel = new JLabel();
		lastScorerLabel = new JLabel("Last Scorer: N/A");
		winnerLabel = new JLabel();

		updateScore();
		setupButton(team1Button, team1);
		setupButton(team2Button, team2);

		setTitle("Match results table");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(250, 150));
		setSize(300, 200);

		setLayout(new GridBagLayout());
		JPanel gui = new JPanel();
		GroupLayout layout = new GroupLayout(gui);
		gui.setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);

		layout.setHorizontalGroup(
				layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(CENTER)
								.addComponent(resultLabel)
								.addComponent(lastScorerLabel)
								.addComponent(winnerLabel)
						.addGroup(layout.createSequentialGroup()
								.addComponent(team1Button)
								.addComponent(team2Button))
		));
		layout.setVerticalGroup(
				layout.createSequentialGroup()
						.addGroup(layout.createSequentialGroup()
								.addComponent(resultLabel)
								.addComponent(lastScorerLabel)
								.addComponent(winnerLabel)
						.addGroup(layout.createParallelGroup(BASELINE)
								.addComponent(team1Button)
								.addComponent(team2Button))
		));

		add(gui);
	}

	private void setupButton(JButton button, Team team) {
		button.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				team.incScore();
				updateScore();
				setLastScorer(team.getName());
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
	}

	private void updateScore() {
		String winner = team1.getScore() == team2.getScore() ? "DRAW" :
				team1.getScore() > team2.getScore() ? team1.getName() : team2.getName();
		resultLabel.setText(String.format("Result: %d X %d", team1.getScore(), team2.getScore()));
		winnerLabel.setText(String.format("Winner: %s", winner));
	}

	private void setLastScorer(String team) {
		lastScorerLabel.setText("Last Scorer: " + team);
	}
}
