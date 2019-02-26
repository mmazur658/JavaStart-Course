package pl.mazurmarcin.javastart.lecture14.homework.task14_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ComputerStore {
	
	// możliwość przechowywania comparatorów w Mapie

	private static Scanner scanner = new Scanner(System.in);
	private static final int SORT_BY_NAME = 1;
	private static final int SORT_BY_CPU = 2;
	private static final int SORT_BY_MEMORY = 3;

	private static void printComputers(List<Computer> computers) {
		for (Computer computer : computers)
			System.out.println(computer);
	}

	private static int getCorrectInt() {

		int number = 0;
		boolean isNumberInt = false;

		do {

			try {
				number = scanner.nextInt();
				isNumberInt = true;
			} catch (InputMismatchException exception) {
				System.out.println("Nieprawidłowy format danych");
				scanner.nextLine();
			}

		} while (!isNumberInt);

		return number;

	}

	private static void printOptions() {
		System.out.println("1. Po Name");
		System.out.println("2. Po Cpu");
		System.out.println("3. Po Memory");
	}

	private static void sortComputers(List<Computer> computers, int userSelect) {

		Comparator<Computer> comparator = null;

		switch (userSelect) {
		case SORT_BY_NAME:
			comparator = new ComputerNameComparator();
			break;
		case SORT_BY_CPU:
			comparator = new ComputerCpuComparator();
			break;
		case SORT_BY_MEMORY:
			comparator = new ComputerMemoryComparator();
			break;
		default:
			System.out.println("Nierozpoznane sortowanie.");
		}

		if (comparator != null) {
			Collections.sort(computers, comparator);
			printComputers(computers);
		}

	}

	public static void main(String[] args) {

		List<Computer> computers = new ArrayList<>();

		Computer computer1 = new Computer("Comp-A", 2500, 1024);
		Computer computer2 = new Computer("Comp-B", 3000, 3072);
		Computer computer3 = new Computer("Comp-B", 3000, 2048);
		Computer computer4 = new Computer("Comp-B", 2000, 4128);
		computers.add(computer1);
		computers.add(computer2);
		computers.add(computer3);
		computers.add(computer4);

		System.out.println("Wybierz sposób sportowania: ");
		printOptions();
		int userInput = getCorrectInt();
		sortComputers(computers, userInput);

	}

}
