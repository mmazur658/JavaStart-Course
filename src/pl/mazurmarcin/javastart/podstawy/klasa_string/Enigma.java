package pl.mazurmarcin.javastart.podstawy.klasa_string;

import java.util.Scanner;

public class Enigma {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ile wyrazów? ");
		String[] strArray = new String[scanner.nextInt()];
		scanner.nextLine();

		for (int i = 0; i < strArray.length; i++)
			strArray[i] = scanner.nextLine();

		scanner.close();

		StringBuilder sb = new StringBuilder();

		for (String word : strArray) {
			sb.append(word.charAt(word.length() - 1));
		}

		System.out.println(sb.toString());

	}

}
