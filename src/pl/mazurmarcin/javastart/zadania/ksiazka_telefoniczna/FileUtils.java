package pl.mazurmarcin.javastart.zadania.ksiazka_telefoniczna;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FileUtils {

	private static final String FILE_NAME = "contacts.csv";

	public static void save(TeleBook teleBook) {

		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_NAME))) {

			for (Contact contact : teleBook) {
				bufferedWriter.write(contact.toCSV());
				bufferedWriter.newLine();
			}

			bufferedWriter.close();

		} catch (IOException exception) {
			System.err.println("Błąd zapisu danych");
		}

	}

	public static TeleBook read() {

		TeleBook teleBook = null;

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_NAME))) {

			Map<String, Contact> contacts = bufferedReader.lines().map(line -> line.split(";"))
					.map(split -> new Contact(split[0], split[1]))
					.collect(Collectors.toMap(Contact::getName, Function.identity()));

			teleBook = new TeleBook(new TreeMap<>(contacts));

			bufferedReader.close();

		} catch (FileNotFoundException exception) {
			System.err.println("Nie znalezniono pliku: " + FILE_NAME);
		} catch (IOException exception) {
			System.err.println("Błąd odczytu danych");
		} catch (ArrayIndexOutOfBoundsException exception) {
			// throws then the file is empty, ignore it.
		}

		return teleBook != null ? teleBook : new TeleBook();
	}
}
