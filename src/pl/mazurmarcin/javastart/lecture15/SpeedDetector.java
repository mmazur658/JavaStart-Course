package pl.mazurmarcin.javastart.lecture15;

import java.util.Scanner;

public class SpeedDetector {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Dostępne prędkości: ");
		for (Speed speed : Speed.values())
			System.out.println(speed);

		System.out.println("Wybierz prędkość: ");
		try {

			String userInput = scanner.nextLine().toUpperCase();
			Speed speed;

			try {
				speed = Speed.getByValue(Integer.parseInt(userInput));
			} catch (NumberFormatException exception) {
				speed = Speed.valueOf(userInput);
			}

			System.out.printf("Poruszasz się z prędkością %s, która wynosi %d km\\h \n", speed, speed.getSpeedValue());

		} catch (IllegalArgumentException exception) {
			System.out.println("Nierozpoznana nazwa prędkości");
		} catch (NullPointerException exception) {
			System.out.println("Brak nazwy dla podanej prędkości");
		}

		scanner.close();

	}

}
