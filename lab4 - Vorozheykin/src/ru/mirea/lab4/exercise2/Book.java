package ru.mirea.lab4.exercise2;

public class Book implements Priceable {
	private final String author;
	private final String title;
	private final int price;

	public Book(String author, String title, int price) {
		this.author = author;
		this.title = title;
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Book " + author + " \"" + title + "\"";
	}
}
