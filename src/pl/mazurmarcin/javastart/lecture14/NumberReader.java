package pl.mazurmarcin.javastart.lecture14;

import java.util.InputMismatchException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class NumberReader {

	private static Scanner scanner = new Scanner(System.in);

	private static int getCorrectInt() {

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

	private static Queue<Integer> createPriorityQueueWithNumbers(int size) {

		Queue<Integer> queue = new PriorityQueue<>();

		for (int i = 0; i < size; i++) {
			System.out.println("Podaj " + (i + 1) + " liczbę:");
			queue.offer((int) Math.pow(getCorrectInt(), 2));
		}

		return queue;
	}

	public static void main(String[] args) {

		System.out.println("Ile liczb? ");
		int size = getCorrectInt();

		Queue<Integer> queue = createPriorityQueueWithNumbers(size);

		while (!queue.isEmpty())
			System.out.println(queue.poll());

	}

}
