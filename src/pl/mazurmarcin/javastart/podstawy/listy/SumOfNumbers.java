package pl.mazurmarcin.javastart.podstawy.listy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SumOfNumbers {

	private static final String EXIT_WORD = "exit";
	private static Scanner scanner = new Scanner(System.in);

	private static void getNumbers(List<Integer> list) {

		System.out.println("Podaj liczbê ca³kowit¹ lub wpisz exit");

		String userInput = scanner.nextLine();

		if (userInput.equals(EXIT_WORD)) {
			return;
		} else {
			try {

				list.add(Integer.parseInt(userInput));

			} catch (NumberFormatException exception) {
				System.out.println("Padana wartoœæ nie jest liczb¹ ca³kowit¹ lub s³owem exit");
			}

			getNumbers(list);
		}

	}

	private static void printNumbersAndSum(List<Integer> list) {

		StringBuilder sb = new StringBuilder();
		int sum = 0;

		for (Integer number : list) {
			sb.append(number);
			sb.append(" + ");
			sum += number;
		}

		sb.replace(sb.length()-2,sb.length(), "= ");
		sb.append(sum);

		System.out.println(sb.toString());
	}

	public static void main(String[] args) {

		List<Integer> numberList = new ArrayList<>();
		getNumbers(numberList);
		printNumbersAndSum(numberList);

	}

}
