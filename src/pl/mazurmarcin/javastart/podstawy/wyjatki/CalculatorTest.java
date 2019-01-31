package pl.mazurmarcin.javastart.podstawy.wyjatki;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);

		boolean readComplete = false;

		String operator = "";
		double a = 0;
		double b = 0;

		while (!readComplete) {

			try {

				System.out.println("Podaj pierwsz¹ liczbê: ");
				a = scanner.nextDouble();

				scanner.nextLine();
				System.out.println("Podaj operator + - * / : ");
				operator = scanner.nextLine();

				System.out.println("Podaj drug¹ liczbê: ");
				b = scanner.nextDouble();

				readComplete = true;

			} catch (InputMismatchException exception) {

				System.out.println("Nieprawid³owe dane, proszê rozpocz¹æ od pocz¹tku!");
				exception.printStackTrace();
			} finally {
				scanner.nextLine();
			}

		}

		scanner.close();

		Calculator calc = new Calculator();
		boolean calculationComplete = false;
		double result = 0;

		try {

			result = calc.calculate(a, b, operator);
			calculationComplete = true;

		} catch (ArithmeticException | UnknownOperatorException exception) {
			System.err.println(exception.getMessage());
		}

		if (calculationComplete) {
			System.out.println(a + " " + operator + " " + b + " = " + result);
		} else {
			System.out.println("Nie mo¿na by³o obliczyæ wyniku wyra¿enia " + a + operator + b);
		}

	}

}
