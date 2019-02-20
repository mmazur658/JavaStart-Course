package pl.mazurmarcin.javastart.lecture13.homework.task13_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class NumbersApp {

	public List<Double> createNumberOfList() {

		Scanner scanner = new Scanner(System.in);
		List<Double> list = new ArrayList<>();
		double userInput = 0;

		do {

			System.out.println("Podaj liczbę dodatnią (ujemną aby zakończyć)");

			try {

				userInput = scanner.nextDouble();

				if (userInput >= 0)
					list.add(userInput);

			} catch (InputMismatchException exception) {
				System.out.println("Nieprawidłowy format - spróbuj ponownie");
				scanner.nextLine();
			}

		} while (userInput >= 0);

		scanner.close();

		return list;
	}

	public void printReversedList(List<Double> list) {

		List<Double> tempList = new ArrayList<>(list);
		Collections.reverse(tempList);

		System.out.println("Reversed list: " + tempList);

	}

	public void printSum(List<Double> list) {

		double sum = 0;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
			sb.append(list.get(i));

			if (i != (list.size() - 1))
				sb.append(" + ");

		}

		sb.append(" = ");
		sb.append(sum);

		System.out.println("Sum of numbers: " + sb.toString());

	}

	public void printBiggestValue(TreeSet<Double> set) {
		System.out.println("Biggest number: " + set.last());
	}

	public void printLowestValue(TreeSet<Double> set) {
		System.out.println("Lowest number: " + set.first());
	}

}
