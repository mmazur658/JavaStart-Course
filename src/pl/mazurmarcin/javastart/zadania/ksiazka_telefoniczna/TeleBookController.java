package pl.mazurmarcin.javastart.zadania.ksiazka_telefoniczna;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TeleBookController {

	private TeleBook teleBook = new TeleBook();
	private Scanner scanner = new Scanner(System.in);

	public TeleBookController() {
		teleBook = FileUtils.read();
	}

	public void loop() {
		OPTIONS option = null;

		do {

			try {

				showOptions();
				option = chooseOption();
				executeOption(option);

			} catch (NoSuchElementException exception) {
				System.out.println("Nieprawidłowa opcja");
			}

		} while (option != OPTIONS.EXIT);

	}

	private void showOptions() {

		System.out.println("Wybierz jedną z poniższych opcji: ");

		for (OPTIONS option : OPTIONS.values())
			System.out.println(option);

	}

	private OPTIONS chooseOption() {

		int number = scanner.nextInt();
		scanner.nextLine();

		return OPTIONS.convertToOption(number);

	}

	private void executeOption(OPTIONS option) {

		switch (option) {
		case ADD_CONTACT:
			addContact();
			break;
		case DELETE:
			delete();
			break;
		case EXIT:
			exit();
			break;
		case SEARCH_BY_NAME:
			searchByName();
			break;
		case SEARCH_BY_PHONE_NUMBER:
			searchByTelephone();
			break;
		}

	}

	private void delete() {

		System.out.println("Podaj nazwę kontaktu do usunięcia: ");
		String name = scanner.nextLine();

		if (!teleBook.deleteContact(name))
			System.out.println("Brak kontaktu o podanej nazwie.");

	}

	private void searchByTelephone() {

		System.out.println("Podaj number telefonu do odszukania: ");
		String phoneNumber = scanner.nextLine();

		List<Contact> contactsList = teleBook.findByPhoneNumber(phoneNumber);

		if (contactsList.isEmpty())
			System.out.println("Brak kontaktu o podanym numerze.");
		else
			printSearchResult(contactsList);

	}

	private void searchByName() {

		System.out.println("Podaj nazwę kontaktu do odszukania: ");
		String name = scanner.nextLine();

		List<Contact> contactsList = teleBook.findByName(name);

		if (contactsList.isEmpty())
			System.out.println("Brak kontaktu o podanej nazwie.");
		else
			printSearchResult(contactsList);
	}

	private void addContact() {

		System.out.println("Podaj nazwę: ");
		String name = scanner.nextLine();

		System.out.println("Podaj numer: ");
		String phoneNumber = scanner.nextLine();

		try {

			if (teleBook.addContact(name, phoneNumber))
				System.out.println("Kontakt został dodany");
			else
				System.out.println("Istnieje już kontakt o podanej nazwie");

		} catch (IllegalArgumentException exception) {
			System.err.println("Nazwa i numer nie mogą być puste.");
		}

	}

	private void exit() {
		scanner.close();
		FileUtils.save(teleBook);
		System.out.println("Do zobaczenia!");
	}

	private void printSearchResult(List<Contact> contactsList) {
		for (Contact contact : contactsList) {
			System.out.println(contact);
		}
	}
}
