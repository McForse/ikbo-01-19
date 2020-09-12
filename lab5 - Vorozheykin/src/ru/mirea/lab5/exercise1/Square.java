package ru.mirea.lab5.exercise1;

import java.awt.*;

public class Square extends Rectangle {
	private int side;

	public Square(int side) {
		super(side, side);
		this.side = side;
	}

	public Square(int side, Color color) {
		super(side, side, color);
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
}
