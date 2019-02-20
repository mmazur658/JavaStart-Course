package pl.mazurmarcin.javastart.lecture13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class NumbeListController {

	private Scanner scanner = new Scanner(System.in);

	public List<Double> createListWithNumbers(int size) {

		List<Double> list = new ArrayList<>();

		do {

			System.out.println("Podaj liczbę: ");
			double userInput = 0;

			try {

				userInput = scanner.nextDouble();
				list.add(userInput);

			} catch (InputMismatchException exception) {
				System.out.println("Nieprawidłowe format liczby.");
				scanner.nextLine();
			}

		} while (list.size() <= size);

		return list;

	}

	public List<Double> getReversedList(List<Double> list) {

		List<Double> tempList = list;
		Collections.reverse(tempList);

		return tempList;

	}

	public double getSumOfNumbersWithEvenIndexes(List<Double> list) {

		double sum = 0;

		for (int i = 0; i < list.size(); i+=2) 
				sum += list.get(i);

		return sum;

	}

	public double getBiggestNumber(List<Double> list) throws IllegalAccessException {

		if (list == null) 
			throw new NullPointerException();
		
		if (list.size() < 1)
			throw new IllegalAccessException();
		
		double biggestNumber = list.get(0);

		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) > biggestNumber)
				biggestNumber = list.get(i);
		}

		return biggestNumber;

	}

	public double getProductOfNumbersWithOddIndexes(List<Double> list) {

		double product = 1;

		for (int i = 1; i < list.size(); i+=2) 
				product *= list.get(i);

		return product;

	}

}
