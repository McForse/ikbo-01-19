package ru.mirea.lab4.exercise1;

public class Book implements Nameable {
	private final String author;
	private final String title;

	public Book(String author, String title) {
		this.author = author;
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String getName() {
		return author + " - " + title;
	}
}
