package pl.mazurmarcin.javastart.lecture6;

import java.util.Locale;

public class StringOfNumbers {

	private static final double MAX_VALUE = 3.0;

	public static void main(String[] args) {

		Locale.setDefault(new Locale("en", "US"));

		double number = 0.0;

		while (number < MAX_VALUE) {
			System.out.printf("%.1f, ", number);
			number += 0.1;
		}
		System.out.printf("%.1f \n", number);

		number = 0.0;
		
		do {
			System.out.printf("%.1f, ", number);
			number += 0.1;
		} while (number < MAX_VALUE);
		System.out.printf("%.1f \n", number);

	}

}
