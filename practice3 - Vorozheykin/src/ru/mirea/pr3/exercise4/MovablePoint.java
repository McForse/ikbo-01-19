package ru.mirea.pr3.exercise4;

public class MovablePoint implements Movable {
	private int x;
	private int y;
	private final int xSpeed;
	private final int ySpeed;

	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	@Override
	public void moveUp() {
		this.y += ySpeed;
		System.out.println("Move up: " + this);
	}

	@Override
	public void moveDown() {
		this.y -= ySpeed;
		System.out.println("Move down: " + this);
	}

	@Override
	public void moveLeft() {
		this.x -= xSpeed;
		System.out.println("Move left: " + this);
	}

	@Override
	public void moveRight() {
		this.x += xSpeed;
		System.out.println("Move right: " + this);
	}


	@Override
	public String toString() {
		return "MovablePoint{" +
				"x=" + x +
				", y=" + y +
				", xSpeed=" + xSpeed +
				", ySpeed=" + ySpeed +
				'}';
	}
}
