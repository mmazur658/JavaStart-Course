package pl.mazurmarcin.javastart.lecture13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListsApp {

	private static Scanner scanner = new Scanner(System.in);
	private static final String BREAK_WORD = "stop";

	private static void fillListWithWords(List<String> wordsList) {

		String userInput = null;

		do {

			System.out.println("Podaj kolejny element (lub stop):");
			userInput = scanner.nextLine();

			if (!BREAK_WORD.equals(userInput))
				wordsList.add(userInput);

		} while (!BREAK_WORD.equals(userInput));

	}

	public static void main(String[] args) {

		List<String> wordsList = new ArrayList<>();
		fillListWithWords(wordsList);

		System.out.println("List size: " + wordsList.size());
		System.out.println("List content: \n" + wordsList.toString());

	}

}
