package pl.mazurmarcin.javastart.lecture7;

import java.util.Scanner;

/**
 * Wyœwietla resztê z dzielenia sumy liczb, których kwadraty s¹ mniejsze jak sto.
 * @author Marcin Mazur
 *
 */
public class PrintNumber {

	public static void main(String[] args) {

		int x = 0;
		int sum = 0;

		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();

		while (x * x < 100) {
			x = scanner.nextInt();
			sum += x;
		}

		sum = sum % 2;

		System.out.println(sum);

		scanner.close();

	}

}
