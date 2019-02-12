package pl.mazurmarcin.javastart.lecture11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WordsReader {

	private static Scanner scanner = new Scanner(System.in);

	private static String getCorrectString() {

		boolean isInputCorrect = false;
		String word = null;

		while (!isInputCorrect) {

			try {
				word = scanner.nextLine();
				isInputCorrect = true;
			} catch (InputMismatchException excpetion) {
				System.out.println("Nieprawidłowe dane wejściowe");
			}
		}

		return word;

	}

	public static void main(String[] args) {

		String[] words = new String[3];

		for (int i = 0; i < words.length; i++) {
			System.out.println("Podaj " + (i + 1) + " napis: ");
			words[i] = getCorrectString();
		}

		while (true) {

			System.out.println("Podaj index do wyświetlenia: ");

			try {
				System.out.println(words[scanner.nextInt()]);
				break;
			} catch (ArrayIndexOutOfBoundsException excpetion) {
				System.out.println("Nieprawidłowy index, spróbuj ponownie");
			}
		}

		scanner.close();

	}

}
