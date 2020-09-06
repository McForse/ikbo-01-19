package ru.mirea.lab3.example3;

public class Sofa extends Furniture {
	private int length;
	private int width;
	private int height;

	public Sofa(long price, int length, int width, int height) {
		super("Sofa", price);
		setLength(length);
		setWidth(width);
		setHeight(height);
		this.height = height;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		if (length < 0) throw new IllegalArgumentException("Length cannot be negative");
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		if (width < 0) throw new IllegalArgumentException("Width cannot be negative");
		this.width = width;
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
		return "Sofa{" +
				"length=" + length +
				", width=" + width +
				", height=" + height +
				", price=" + getPrice() +
				'}';
	}
}
