package ru.mirea.lab1;

public class Book {
	private final String title;

	private final String author;

	private final String genre;

	private final int pages;

	public Book(String title, String author, String genre, int pages) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Book{" +
				"title='" + title + '\'' +
				", author='" + author + '\'' +
				", genre='" + genre + '\'' +
				", pages=" + pages +
				'}';
	}
}
