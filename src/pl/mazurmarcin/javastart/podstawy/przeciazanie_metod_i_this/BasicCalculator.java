package pl.mazurmarcin.javastart.podstawy.przeciazanie_metod_i_this;

import java.util.Scanner;

import pl.mazurmarcin.javastart.podstawy.wprowadzanie_danych.OneMoreCalculator;

public class BasicCalculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		OneMoreCalculator calc = new OneMoreCalculator();

		System.out.println("Podaj pierwszą liczbę");
		double firstNumber = scanner.nextDouble();

		System.out.println("Podaj symbol matematyczny: + - / * ");
		scanner.nextLine();
		String symbol = scanner.nextLine();

		System.out.println("Podaj drugą liczbę");
		double secondNumber = scanner.nextDouble();

		System.out.println(calc.calculate(firstNumber, secondNumber, symbol));
		scanner.close();

	}

}
