package pl.mazurmarcin.javastart.lecture10;

import java.util.Scanner;

public class WordReader {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String word = null;
		String lastWord = null;

		System.out.println("Start");

		do {

			lastWord = word;
			word = scanner.nextLine();

		} while (!word.equals(lastWord));

		System.out.println("Koniec");

		scanner.close();

	}

}
