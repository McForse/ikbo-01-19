package ru.mirea.lab3.example3;

public abstract class Furniture {
	private String name;
	private long price;

	public Furniture(String name, long price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		if (price < 0) throw new IllegalArgumentException("Price cannot be negative");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Furniture{" +
				"name='" + name + '\'' +
				", price=" + price +
				'}';
	}
}
