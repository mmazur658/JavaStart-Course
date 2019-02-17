package pl.mazurmarcin.javastart.lecture12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class TextStatistics {

	private final static String FILE_NAME = "text.txt";

	private static String getSingleLineFromTextFile(File file) {

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

			String line = null;
			if ((line = bufferedReader.readLine()) != null)
				return line;

		} catch (FileNotFoundException exception) {
			System.err.println("Plik nie został odnaleziony.");
		} catch (IOException exception) {
			System.err.println("Plik odczytu danych.");
		}

		return null;
	}

	private static long getNumberOfAllCharacters(String line) {
		return line.length();
	}

	private static long getNumberOfAllBlackCharacter(String line) {

		long count = 0;

		char ch;
		for (int i = 0; i < line.length(); i++) {
			ch = line.charAt(i);
			if (!Character.isWhitespace(ch))
				count++;
		}

		return count;
	}

	private static long getNumberOfWords(String line) {

		long count = 0;
		StringTokenizer stringTokenizer = new StringTokenizer(line);

		while (stringTokenizer.hasMoreTokens()) {
			stringTokenizer.nextToken();
			count++;
		}

		return count;
	}

	public static void main(String[] args) {

		File file = new File(FILE_NAME);
		String line = getSingleLineFromTextFile(file);

		System.out.println("Ilość słów w tekście: " + getNumberOfWords(line));
		System.out.println("Ilość wszystkich znaków: " + getNumberOfAllCharacters(line));
		System.out.println("Ilość czarnych znaków: " + getNumberOfAllBlackCharacter(line));

	}

}
