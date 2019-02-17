package pl.mazurmarcin.javastart.lecture12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class FileReaderTest {

	private final static String FILE_NAME = "text.txt";

	private static void readFileWithScanner(File file) {

		try (Scanner scanner = new Scanner(file)) {

			while (scanner.hasNextLine())
				System.out.println(scanner.nextLine());

		} catch (FileNotFoundException exception) {
			System.out.println("Plik nie został odnaleziony.");
		}

	}

	private static void readFileWithBufferedReader(File file) {

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

			String line = null;
			while ((line = bufferedReader.readLine()) != null)
				System.out.println(line);

		} catch (FileNotFoundException exception) {
			System.err.println("Plik nie został odnaleziony.");
		} catch (IOException exception) {
			System.err.println("Plik odczytu danych.");
		}

	}

	public static void main(String[] args) {

		File file = new File(FILE_NAME);

		if (!file.exists())
			try {
				file.createNewFile();
			} catch (IOException exception) {
				System.out.println("Nie można utworzyć pliku");
			}

		System.out.println("Odczyt z wykorzystaniem Scanner: ");
		readFileWithScanner(file);

		System.out.println("\n\nOdczyt z wykorzystaniem BufferedReader: ");
		readFileWithBufferedReader(file);

	}

}
