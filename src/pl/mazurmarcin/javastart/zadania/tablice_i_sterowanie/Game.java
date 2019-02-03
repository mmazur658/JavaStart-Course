package pl.mazurmarcin.javastart.zadania.tablice_i_sterowanie;

import java.util.Scanner;

public class Game {

	private static final int NEXT_GAME = 1;
	private static final int END_GAME = 2;

	private WordsDatabase wordsDatabase = new WordsDatabase();
	private Scanner scanner = new Scanner(System.in);

	private void printOptions() {
		System.out.println(NEXT_GAME + " - Nowa gra");
		System.out.println(END_GAME + " - Koniec");
	}

	private void play() {

		Hangman hangman = new Hangman(wordsDatabase.getRandomWord());
		scanner.nextLine();
		
		boolean gameResult=false;

		do {			
			
			System.out.println("Hasło do odgadnięcia: ");
			hangman.printWord();
			System.out.println("Podaj literę: ");

			String userLine = scanner.nextLine();
			char letter = userLine.charAt(0);

			if (hangman.containsGivenLetter(letter))
				System.out.println("Poprawna litera. Pozostało prób: " + hangman.getNumberOfMistakes());
			else
				System.out.println("Niepoprawna litera. Pozostało prób: " + hangman.getNumberOfMistakes());
	
			
			if(!hangman.isAbleToContinueGame())
				break;
						
			gameResult=hangman.isUserWin();

		} while (!gameResult);
		
		printResult(gameResult);

	}

	public void mainLoop() {

		int userInput = 0;

		do {

			printOptions();
			userInput = scanner.nextInt();

			switch (userInput) {
			case NEXT_GAME:
				play();
				break;
			case END_GAME:
				System.out.println("Do zobaczenia!");
				break;
			default:
				System.out.println("Opcja nierozpoznana");
			}

		} while (userInput != END_GAME);

	}
	
	private void printResult(boolean gameResult) {
		
		if(gameResult)
			System.out.println("Gratulacja, you have won");
		else
			System.out.println("Wyczerpłałeś ilość szans. Koniec gry. ");		

		
	}

}
