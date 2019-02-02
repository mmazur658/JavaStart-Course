package pl.mazurmarcin.javastart.podstawy.mapy;

import java.util.Scanner;

public class CompanyApp {

	public static final int ADD_EMPLOYEE = 1;
	public static final int FIND_EMPLOYEE = 2;
	public static final int EXIT = 3;
	private static Scanner scanner = new Scanner(System.in);
	private static Company company = new Company();

	private static void printOptions() {
		System.out.println(ADD_EMPLOYEE + " - Dodaj nowego pracownika");
		System.out.println(FIND_EMPLOYEE + " - Znajdz pracownika");
		System.out.println(EXIT + " - Wyjście");

	}

	private static void closeScanner() {
		scanner.close();
	}

	private static void findAndPrintEmployee() {

		System.out.println("Podaj imię: ");
		String firstName = scanner.nextLine();

		System.out.println("Podaj nazwisko: ");
		String lastName = scanner.nextLine();

		Employee employee = company.getEmployee(firstName, lastName);
		
		System.out.println(employee);

	}

	private static void addEmployee() {

		System.out.println("Podaj imię: ");
		String firstName = scanner.nextLine();

		System.out.println("Podaj nazwisko: ");
		String lastName = scanner.nextLine();

		System.out.println("Podaj wynagordzenie: ");
		double salary = scanner.nextDouble();

		Employee employee = new Employee(firstName, lastName, salary);
		company.addEmployee(employee);

	}

	public static void main(String[] args) {

		int userInput = 0;

		do {

			printOptions();
			userInput = scanner.nextInt();
			scanner.nextLine();

			switch (userInput) {
			case CompanyApp.ADD_EMPLOYEE:
				addEmployee();
				break;
			case CompanyApp.FIND_EMPLOYEE:
				findAndPrintEmployee();
				break;
			case CompanyApp.EXIT:
				break;
			}

		} while (userInput != EXIT);

		closeScanner();

	}
}
