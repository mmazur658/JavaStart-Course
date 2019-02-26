package pl.mazurmarcin.javastart.lecture14.cashmachine;

import java.util.Scanner;

public class CashMachineApp {

	private Scanner scanner = new Scanner(System.in);
	private CashMachine cashMachine = new CashMachine();

	public void mainLoop() {

		double moneyToPay = cashMachine.getRandomValue();
		String userInput = null;

		sayHello();

		do {
			System.out.printf("Do zapłaty: %.2f zł. Wrzuć kolejny banknot lub monetę: \n", (moneyToPay / 100));
			userInput = scanner.nextLine();
			moneyToPay -= getBillValue(userInput);

		} while (moneyToPay > 0);

		giveChange(moneyToPay);

	}

	private void sayHello() {
		System.out.println("Witaj w CachMachine. Automat obsługuje następujące monety i banknoty: ");
		cashMachine.printDenominationsNames();
	}

	private double getBillValue(String billName) {

		double billValue = 0;

		try {
			billValue = cashMachine.getBillValue(billName);
		} catch (IllegalArgumentException exception) {
			System.err.println("Moneta lub banknot nierozpoznana.");
		}

		return billValue;
	}

	private void giveChange(double value) {

		double absoluteValue = Math.abs(value);
		System.out.printf("Reszta: %.2f zł \n%s \n", (absoluteValue / 100), cashMachine.calculateChange(absoluteValue));
		
	}

}
