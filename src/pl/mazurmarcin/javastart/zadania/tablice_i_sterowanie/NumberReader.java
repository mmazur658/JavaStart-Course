package pl.mazurmarcin.javastart.zadania.tablice_i_sterowanie;

import java.util.Scanner;

public class NumberReader {

	private static void printNumbers(double number) {

		if (number > 0) {

			for (double i = 0; i < (number + 0.1); i += 0.1)
				System.out.printf("%.1f, ", i);

		} else {

			for (double i = 0; i > (number - 0.1); i -= 0.1)
				System.out.printf("%.1f ", i);

		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Podaj liczbê ca³kowit¹ ró¿n¹ od zera: ");
		double number = scanner.nextInt();

		if (number == 0)
			System.out.println("Liczba nie mo¿e byæ równa zero");
		else
			printNumbers(number);

		scanner.close();

	}

}
