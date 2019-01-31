package pl.mazurmarcin.javastart.lecture7;

import java.util.Scanner;

public class LinearEquation {

	public static void main(String[] args) {

		System.out.println("Podaj wartoœæ A, B i C:");
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();

		while (a == 0) {
			System.out.println("Wartoœæ A nie mo¿e byæ równa 0, wprowadz ponownie: ");
			a = scanner.nextDouble();
		}

		double result = (c - b) / a;

		System.out.println("Wynik równania liniowego ax+b=c to x = " + result);

		scanner.close();

	}

}
