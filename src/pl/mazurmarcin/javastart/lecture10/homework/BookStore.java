package pl.mazurmarcin.javastart.lecture10.homework;

import java.util.Scanner;

public class BookStore {

	private Book[] books;
	private int booksIndex = 0;
	private Scanner scanner = new Scanner(System.in);

	public BookStore(int numberOfBooks) {
		books = new Book[numberOfBooks];
	}

	public void mainLoop() {

		while (booksIndex < books.length) {

			if (addBook())
				booksIndex++;

		}

		scanner.close();		
		System.out.println("Tablica została wypełniona unikatowymi książkami.");
	}

	private boolean addBook() {

		System.out.println("Podaj tytuł: ");
		String title = scanner.nextLine();

		System.out.println("Podaj autora: ");
		String author = scanner.nextLine();

		System.out.println("Podaj strony: ");
		int pages = scanner.nextInt();
		scanner.nextLine();
		
		Book tempBook = new Book(title, author, pages);

		if (isBookUnique(tempBook)) {
			books[booksIndex] = tempBook;
			System.out.println("Książka została dodana. \n");
			return true;
		} else {
			System.out.println("Książka już istnieje, wprowadz nowe dane. \n");
			return false;
		}

	}

	private boolean isBookUnique(Book book) {

		for (int i = 0; i < booksIndex; i++) {
			if (book.equals(books[i]))
				return false;
		}

		return true;
	}

}
