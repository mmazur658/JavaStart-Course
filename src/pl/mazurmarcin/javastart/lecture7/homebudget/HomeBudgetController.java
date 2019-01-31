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

		System.out.println("Podaj number miesi¹ca( 1 - 12 ): ");
		int monthNumber = input.nextInt();

		input.nextLine();
		System.out.println("Podaj typ wydatku: ");
		String type = input.nextLine();

		System.out.println("Podaj wartoœæ wydatku: ");
		double amount = input.nextDouble();

		homeBudget.add(new Outgo(monthNumber, amount, type));
	}

	public void printAllOutgoes() {
		homeBudget.printOutgoes();
	}

	public void showOutgoesBiggerThenGivenValue() {

		System.out.println("Podaj wartoœæ: ");

		try {

			homeBudget.showOutgoesBiggerThenGivenValue(input.nextDouble());

		} catch (InputMismatchException exception) {
			System.err.println("Nieprawid³owa wartoœæ!!");
		}

	}

	public void showOutgoesForGivenType() {
		System.out.println("Podaj typ wydatku: ");
		input.nextLine();
		homeBudget.printUniqueTypes();
		homeBudget.showOutgoesForGivenType(input.nextLine());
	}

	public void showMonthlyOutgoes() {

		System.out.println("Podaj number miesi¹ca( 1 - 12 ): ");
		int userInput = input.nextInt();

		if (userInput < 1 || userInput > 12)
			System.out.println("Nieprawid³owy number miesi¹ca");
		else
			homeBudget.showMonthlyOutgoes(userInput);

	}

	public void showYearlyChart() {
		homeBudget.showYearlyChart();

	}

}
