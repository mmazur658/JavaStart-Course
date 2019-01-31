package pl.mazurmarcin.javastart.lecture8;

import java.util.Scanner;

public class CarFactory {
	
	private static Scanner scanner = new Scanner(System.in);

	public static Car createCar() {
		
		Car car = new Car();

		System.out.println(" \nTworzenie nowego sacmochod \n");
		System.out.println("Podaj nazwê samochodu: ");
		car.setName(scanner.nextLine());

		System.out.println("Podaj spalanie na 100km: ");
		car.setFuelConsumption(scanner.nextDouble());

		System.out.println("Podaj ograniczenie prêdkoœci: ");
		car.setSpeedLimit(scanner.nextInt());
		
		scanner.nextLine();
		return car;

	}
	
	public static void closeScanner() {
		scanner.close();
	}
	
	



}
