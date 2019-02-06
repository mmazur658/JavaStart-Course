package pl.mazurmarcin.javastart.zadania.obsluga_bledow;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameMachineController {

	public static void main(String[] args) {
		buyGame();
	}

	private static void buyGame() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Podaj tytuł gry: ");
		String gameTitle = scanner.nextLine();

		System.out.println("Wpłać pieniądze: ");
		double money = 0;
		try {
			money = scanner.nextDouble();
		} catch (InputMismatchException exception) {
			System.err.println("To nie są pieniądzę!!!");
			exception.printStackTrace();
		}

		GameMachine gameMachine = new GameMachine();

		try {
			
			Game game = gameMachine.sellGame(gameTitle, money);
			System.out.println("Odbierz grę: "+game.getName());
			System.out.println("Reszta: "+(money-game.getPrice()));
			
		} catch (GameNotFoundException | NotEnoughMoneyException exception) {
			System.err.println(exception.getMessage());
		}

		scanner.close();
	}

}
