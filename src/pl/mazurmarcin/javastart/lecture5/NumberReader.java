package pl.mazurmarcin.javastart.lecture5;

import java.util.Scanner;

public class NumberReader {

	public static void main(String[] args) {
		
		NumberChecker numberChecker = new NumberChecker();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Podaj 3 liczby: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int leastNumber = numberChecker.least(a, b, c);
		int greatestNumber = numberChecker.greatest(a, b, c);
		double avarange = numberChecker.average(a, b, c);
		
		System.out.println("Avarange: "+avarange+", least number: "+leastNumber+", greatest number: "+greatestNumber);

		scanner.close();

	}

}
