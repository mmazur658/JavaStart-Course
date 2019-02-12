package pl.mazurmarcin.javastart.lecture11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfNumbers {

	private static Scanner scanner = new Scanner(System.in);

	private static int getSum(int[] numbers) {

		int sum = 0;

		for (int i : numbers)
			sum += i;

		return sum;

	}

	private static int getCorrectInt() {

		boolean isInputCorrect = false;
		int number = 0;

		while (!isInputCorrect) {

			System.out.println("Podaj liczbę całkowitą: ");

			try {
				number = scanner.nextInt();
				isInputCorrect = true;
			} catch (InputMismatchException excpetion) {
				System.out.println("Podana wartość nie jest liczbą całkowitą, spróbuj ponownie. ");
			} finally {
				scanner.nextLine();
			}

		}

		return number;

	}

	public static void main(String[] args) {

		int[] numbers = new int[5];

		for (int i = 0; i < numbers.length; i++)
			numbers[i] = getCorrectInt();

		System.out.println(getSum(numbers));

		scanner.close();

	}

}
