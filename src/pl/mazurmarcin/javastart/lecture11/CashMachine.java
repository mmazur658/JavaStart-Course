package pl.mazurmarcin.javastart.lecture11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CashMachine {

	private BankAccount bankAccount;
	private Scanner scanner = new Scanner(System.in);

	private final int DEPOSIT_MONEY = 1;
	private final int WITHDRAW_MONEY = 2;
	private final int CHANGE_LIMIT = 3;
	private final int GET_BALANCE = 4;
	private final int EXIT = 5;

	public CashMachine(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	public void mainLoop() {

		System.out.println("Witaj w banku");

		int userInput = 0;

		do {
			printOptions();

			try {

				userInput = scanner.nextInt();
				makeOperation(userInput);

			} catch (InputMismatchException exception) {
				System.out.println("Nieznana komenda");
			} finally {
				scanner.nextLine();
			}

		} while (userInput != EXIT);

		scanner.close();

	}

	private void printOptions() {

		System.out.println(DEPOSIT_MONEY + ". Wpłata");
		System.out.println(WITHDRAW_MONEY + ". Wypłata");
		System.out.println(CHANGE_LIMIT + ". Zmiana limitu");
		System.out.println(GET_BALANCE + ". Stan konta");
		System.out.println(EXIT + ". Wyjście");

	}

	private void makeOperation(int userInput) {

		switch (userInput) {
		case DEPOSIT_MONEY:
			deposit();
			break;
		case WITHDRAW_MONEY:
			withdraw();
			break;
		case CHANGE_LIMIT:
			changeLimit();
			break;
		case EXIT:
			System.out.println("Do widzenia!");
			break;
		case GET_BALANCE:
			getBalance();
			break;
		default:
			System.out.println("Nieznana komenda");
		}

	}

	private void getBalance() {
		System.out.println("Stan konta: " + bankAccount.getBalance());
	}

	private void deposit() {
		System.out.println("Podaj kwotę: ");
		double value = getCorrectValue();
		bankAccount.deposit(value);
	}

	private void withdraw() {

		System.out.println("Podaj kwotę: ");
		double value = getCorrectValue();

		try {
			bankAccount.withdraw(value);
			System.out.println("Oto twoje pieniądze: " + value);
		} catch (NotEnoughBalanceException exception) {
			System.out.println("Brak wymaganych środków na koncie");
		} catch (WithdrawValueOutOfLimitBoundsException exception) {
			System.out.println("Podana kwota jest wyższa niż limit");
		}

	}

	private void changeLimit() {

		System.out.println("Obecny limit: " + ((bankAccount.getLimit() == 0) ? "Brak" : bankAccount.getLimit()));
		System.out.print("Podaj nowy limit:  ");
		double limit = getCorrectValue();
		bankAccount.setLimit(limit);
		System.out.println("\nLimit został zmieniony na: " + ((limit == 0) ? "Brak" : limit));

	}

	private double getCorrectValue() {

		double value = 0;
		boolean isValueOK = false;

		while (!isValueOK) {

			try {
				value = scanner.nextDouble();
				if (value <= 0)
					System.out.println("Podaj wartość musi być większa niż zero");
				else
					isValueOK = true;
			} catch (InputMismatchException exception) {
				System.out.println("Nieprawidłowe dane");
				scanner.nextLine();
			}
		}

		return value;
	}

	

}
