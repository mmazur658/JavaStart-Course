package pl.mazurmarcin.javastart.lecture5;

import java.util.Locale;
import java.util.Scanner;

public class ScanTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		
	/*	System.out.println("Podaj wiek: ");
		int age = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Podaj imi�: ");
		String name = scanner.nextLine();
		
		System.out.println("Cze��, "+name+" "+age);
	*/
		
		System.out.println("Podaj liczb�: ");
		double number = scanner.nextDouble();
		System.out.println(Math.pow(number, 2));
		
		
		scanner.nextLine();
		
		
		
		scanner.close();
	}

}
