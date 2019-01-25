package pl.mazurmarcin.javastart.lecture6;

import java.util.Scanner;

public class CorrectNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean isNumberCorrect = false;
		
		int userInput;

		do {
			
			System.out.println("Podaj liczb�: ");
			userInput = scanner.nextInt();
			
			if(userInput>200)
				System.out.println("\nPodana liczba jest za du�a");
			else if(userInput < 100)
				System.out.println("\nPodana liczba jest za ma�a");
			else {
				if(userInput%3==0) {
					isNumberCorrect=true;
					System.out.println("Twoja liczba jest ok");
				} else 
					System.out.println("\nLiczba nie jest podzielna przez 3");
			}
				
			

		} while (!isNumberCorrect);
		
		
		scanner.close();

	}

}
