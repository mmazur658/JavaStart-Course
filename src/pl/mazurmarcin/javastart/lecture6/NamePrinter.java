package pl.mazurmarcin.javastart.lecture6;

import java.util.Scanner;

public class NamePrinter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] nameArray = new String[5];

		System.out.println("Podaj 5 imion: ");

		for (int i = 4; i >= 0; i--)
			nameArray[i] = scanner.nextLine();

		for (String name : nameArray) {
			System.out.println("Czeœæ " + name);
		}

		scanner.close();

	}

}
