package pl.mazurmarcin.javastart.lecture6;

import java.util.Locale;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);

		double[] variables = new double[3];

		System.out.println("Podaj pierwsz¹ liczbê: ");
		variables[0] = scanner.nextDouble();

		System.out.println("Podaj drug¹ liczbê: ");
		variables[1] = scanner.nextDouble();

		System.out.println("Podaj trzeci¹ liczbê: ");
		variables[2] = scanner.nextDouble();

		System.out.printf("%.2f + %.2f + %.2f = %.2f", variables[0], variables[1], variables[2],
				(variables[0] + variables[1] + variables[2]));

		System.out.println();

		System.out.println(variables[0] + " + " + variables[1] + " + " + variables[2] + " = "
				+ (variables[0] + variables[1] + variables[2]));

		scanner.close();

	}

}
