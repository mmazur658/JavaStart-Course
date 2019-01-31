package pl.mazurmarcin.javastart.podstawy.typ_wyliczeniowy_enum;

import java.util.Scanner;

public class Pizzeria {

	public static void main(String[] args) {

		System.out.println("Menu");
		for (Pizza pizza : Pizza.values()) {
			System.out.println(pizza);
		}

		Scanner input = new Scanner(System.in);

		System.out.println("Jak� pizz� wybierasz?");

		Pizza pizza = Pizza.valueOf(input.nextLine());

		System.out.println("Zam�wienie:" + pizza.name());

		input.close();

	}

}
