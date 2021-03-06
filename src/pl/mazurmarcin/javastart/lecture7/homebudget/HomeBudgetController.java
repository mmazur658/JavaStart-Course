package pl.mazurmarcin.javastart.lecture7.homebudget;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeBudgetController {

	Scanner input = new Scanner(System.in);
	HomeBudget homeBudget = new HomeBudget();

	public void closeScanner() {
		input.close();
	}

	public int getSelectedOption() {
		return input.nextInt();
	}

	public void addNewOutgo() {

		System.out.println("Podaj number miesi�ca( 1 - 12 ): ");
		int monthNumber = input.nextInt();

		input.nextLine();
		System.out.println("Podaj typ wydatku: ");
		String type = input.nextLine();

		System.out.println("Podaj warto�� wydatku: ");
		double amount = input.nextDouble();
		
		if (monthNumber < 1 || monthNumber > 12)
			System.out.println("Number miesi�ca musi by� w przedziale 1-12");
		else if (amount <= 0)
			System.out.println("Warto�� nie mo�� by� mniejsza b�dz r�wna zero");
		else
			homeBudget.add(new Outgo(monthNumber, amount, type));
		
	}

	public void printAllOutgoes() {
		homeBudget.printOutgoes();
	}

	public void showOutgoesBiggerThenGivenValue() {

		System.out.println("Podaj warto��: ");

		try {

			homeBudget.showOutgoesBiggerThenGivenValue(input.nextDouble());

		} catch (InputMismatchException exception) {
			System.err.println("Nieprawid�owa warto��!!");
		}

	}

	public void showOutgoesForGivenType() {
		System.out.println("Podaj typ wydatku: ");
		input.nextLine();
		homeBudget.printUniqueTypes();
		homeBudget.showOutgoesForGivenType(input.nextLine());
	}

	public void showMonthlyOutgoes() {

		System.out.println("Podaj number miesi�ca( 1 - 12 ): ");
		int userInput = input.nextInt();

		if (userInput < 1 || userInput > 12)
			System.out.println("Nieprawid�owy number miesi�ca");
		else
			homeBudget.showMonthlyOutgoes(userInput);

	}

	public void showYearlyChart() {
		System.out.println("Podaj rodzaj wykresu: 1. Pionowy  2. Poziomy");
		homeBudget.showYearlyChart(input.nextInt());

	}

}
