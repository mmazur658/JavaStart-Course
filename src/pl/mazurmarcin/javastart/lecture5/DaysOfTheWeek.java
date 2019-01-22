package pl.mazurmarcin.javastart.lecture5;

import java.util.Scanner;

public class DaysOfTheWeek {
	
	public static void main(String[] args) {	
		
		DaysController daysController = new DaysController();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Podaj liczbê ca³kowi¹: ");
		int number = input.nextInt();

		daysController.showMessage(number);
		
		input.close();
		
		
	}

}
