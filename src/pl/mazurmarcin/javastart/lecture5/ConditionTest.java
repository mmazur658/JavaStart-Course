package pl.mazurmarcin.javastart.lecture5;

import java.util.Scanner;

public class ConditionTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Podaj liczbê ca³kowi¹: ");
		int number = input.nextInt();

		System.out.println();

		if (number % 2 == 0)
			System.out.println("Liczba jest parzysta");
		else
			System.out.println("Liczba jest nieparzysta");

		if (number >= 0)
			System.out.println("Liczba jest dodatnia");
		else
			System.out.println("Liczba jest ujemna");

		int tempResult1 = number * 9;
		int tempResult2 = number * number;

		if (tempResult1 % 6 == 0)
			System.out.println(tempResult1 + " jest podzielne przez 6");
		else if (tempResult2 < 100)
			System.out.println(tempResult2 + " jest mniejsze ni¿ 100");
		
		input.close();

	}

}
