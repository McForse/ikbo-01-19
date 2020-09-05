package ru.mirea.lab2.example3;

public class BookTest {

	public static void main(String[] args) {
		Book book = new Book("Michael Bulgakov", "Master and Margarita", 1966, "Novel", 480);

		System.out.println("Book before editing:\n" + book);

		book.setAuthor("Leo Tolstoy");
		book.setTitle("War and Peace");
		book.setYear(1867);
		book.setGenre("Novel");
		book.setPages(1225);

		System.out.println("\nBook after editing:\n" + book);
	}
}
