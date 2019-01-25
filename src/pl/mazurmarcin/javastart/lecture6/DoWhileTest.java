package pl.mazurmarcin.javastart.lecture6;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Podaj 5 liczb ca³kowitych: ");

		int sum = 0;
		int i = 1;
		
		while (i <= 5) {
			sum += scanner.nextInt();
			i++;
		}
		
		System.out.println("Suma to: "+sum);
		
		scanner.close();

	}

}
