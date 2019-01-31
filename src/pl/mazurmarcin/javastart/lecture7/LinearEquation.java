package pl.mazurmarcin.javastart.lecture7;

import java.util.Scanner;

public class LinearEquation {

	public static void main(String[] args) {

		System.out.println("Podaj warto�� A, B i C:");
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();

		while (a == 0) {
			System.out.println("Warto�� A nie mo�e by� r�wna 0, wprowadz ponownie: ");
			a = scanner.nextDouble();
		}

		double result = (c - b) / a;

		System.out.println("Wynik r�wnania liniowego ax+b=c to x = " + result);

		scanner.close();

	}

}
