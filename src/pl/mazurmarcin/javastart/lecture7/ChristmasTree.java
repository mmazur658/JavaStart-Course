package pl.mazurmarcin.javastart.lecture7;

import java.util.Scanner;

public class ChristmasTree {

	private static void printTree(int height) {

		for (int i = 0; i < height; i++) {

			for (int j = height - (1 + i); j > 0; j--)
				System.out.print(" ");

			for (int j = 0; j < (i * 2) + 1; j++)
				System.out.print("0");

			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);		

		System.out.println("Podaj liczbê ca³kowit¹ z przedzia³u 1-20 ");
		printTree(scanner.nextInt());

		scanner.close();
	}

}
