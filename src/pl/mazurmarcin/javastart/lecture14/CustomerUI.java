package pl.mazurmarcin.javastart.lecture14;

import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomerUI {

	private Scanner scanner = new Scanner(System.in);
	private CustomerBase customerBase = new CustomerBase();

	public int getUserInput() {
		System.out.println("Podaj ID klienta: ");
		return getCorrectInt();
	}

	private int getCorrectInt() {

		int number = 0;
		boolean isNumberInt = false;

		do {

			try {
				number = scanner.nextInt();
				isNumberInt = true;
			} catch (InputMismatchException exception) {
				System.out.println("Nieprawidłowy format danych. Spróbuj ponownie.");
				scanner.nextLine();
			}

		} while (!isNumberInt);

		return number;

	}

	public void printKeySet() {
		System.out.println(customerBase.getMap().keySet());
	}

	public void printAllCustomers() {

		Collection<Customer> customers = customerBase.getMap().values();

		for (Customer customer : customers)
			System.out.println(customer);

	}

	public void printCustomer(int userInput) {

		Customer customer;
		try {
			customer = customerBase.findById(userInput);
			System.out.println(customer);
		} catch (NullPointerException exception) {
			System.out.println("Brak klienta o podanym ID.");
		}

	}

}
