package pl.mazurmarcin.javastart.zadania.tablice_i_sterowanie;

import java.util.Scanner;

public class Barman {

	private Scanner scanner = new Scanner(System.in);

	public Drink createDrink() {

		System.out.println("Nazwa drinka: ");
		String drinkName = scanner.nextLine();

		System.out.println("Ile składników? ");
		int numberOfIngredients = scanner.nextInt();

		Ingredient[] ingredients = new Ingredient[numberOfIngredients];

		for (int i = 0; i < ingredients.length; i++) {

			scanner.nextLine();
			System.out.println("Podaj nazwę składnika i ilość: ");
			ingredients[i] = new Ingredient(scanner.nextLine(), scanner.nextDouble());

		}

		return new Drink(drinkName, ingredients);
	}

	public void printDrink(Drink drink) {

		System.out.println(
				"Drink " + drink.getDrinkName() + " składa się z " + drink.getIngredients().length + " składników: ");
		for (Ingredient ingredient : drink.getIngredients()) {
			System.out.println("- " + ingredient);
		}

	}

	public void closeScanner() {
		scanner.close();
	}

}
