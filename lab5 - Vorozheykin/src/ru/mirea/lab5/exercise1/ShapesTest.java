package ru.mirea.lab5.exercise1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ShapesTest extends JFrame {
	private final Random rand;

	public ShapesTest() {
		rand = new Random(System.currentTimeMillis());
		initComponents();
	}

	private void initComponents() {
		setTitle("Shapes test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(700, 600));
		getRootPane().setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		setLayout(new GridLayout(4, 5));

		for (int i = 0; i < 20; i++) {
			add(getRandomShape());
		}
	}

	private Shape getRandomShape() {
		float r = rand.nextFloat();
		float g = rand.nextFloat();
		float b = rand.nextFloat();
		Color color = new Color(r, g, b);

		switch (rand.nextInt(5)) {
			case 0: return new Oval(getRandLength(), getRandLength() - 20, color);
			case 1: return new Circle(getRandLength() / 2, color);
			case 2: return new Rectangle(getRandLength(), getRandLength(), color);
			case 3: return new Square(getRandLength(), color);
			case 4: return new Triangle(getRandLength(), getRandLength() - 20, color);
		}

		return null;
	}

	private int getRandLength() {
		int max = 100;
		int min = 50;
		return rand.nextInt((max - min) + 1) + min;
	}

	public static void main(String[] args) {
		new ShapesTest().setVisible(true);
	}
}
