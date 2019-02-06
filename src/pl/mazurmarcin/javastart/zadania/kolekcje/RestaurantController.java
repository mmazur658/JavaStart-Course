package pl.mazurmarcin.javastart.zadania.kolekcje;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RestaurantController {

	private Menu menu = new Menu();

	public void mainMenu() {

		System.out.println("Witaj w restauracji. Oto menu: ");
		menu.printMenu();

		Order order = takeOrder();
		printSummary(order);
	}

	private Order takeOrder() {

		List<Integer> dishesIds = getDishesIds();
		List<Dish> dishesList = menu.convertIdsToDishes(dishesIds);

		return new Order(dishesList);
	}

	private void printSummary(Order order) {
		System.out.println(order.toString());
	}

	private List<Integer> getDishesIds() {

		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		String[] array = userInput.replaceAll(" ", "").split(",");

		return Arrays.stream(array).map(Integer::valueOf).collect(Collectors.toList());

	}

}
