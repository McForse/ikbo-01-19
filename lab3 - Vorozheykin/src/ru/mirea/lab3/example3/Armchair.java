package ru.mirea.lab3.example3;

public class Armchair extends Furniture {
	private int width;
	private int depth;
	private int height;

	public Armchair(long price, int width, int depth, int height) {
		super("Armchair", price);
		setWidth(width);
		setDepth(depth);
		setHeight(height);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		if (width < 0) throw new IllegalArgumentException("Width cannot be negative");
		this.width = width;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		if (depth < 0) throw new IllegalArgumentException("Depth cannot be negative");
		this.depth = depth;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		if (height < 0) throw new IllegalArgumentException("Height cannot be negative");
		this.height = height;
	}

	@Override
	public String toString() {
		return "Armchair{" +
				"width=" + width +
				", depth=" + depth +
				", height=" + height +
				", price=" + getPrice() +
				'}';
	}
}
