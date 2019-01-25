package pl.mazurmarcin.javastart.lecture6;

import java.util.Scanner;

public class Numbers {

	private static final int MAX_NUMBER = 100;
	private static final int MIN_NUMBER = -100;
	
	private static void printNumbers(int min, int max) {
		
		while (min != max) {			
			System.out.print(min + ", ");
			min++;			
		}
		
		System.out.print(min+"\n\n");
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj liczbê z przedzia³u od -100 do 100");
		int number = scanner.nextInt();
		
		if (number < MIN_NUMBER || number > MAX_NUMBER)			
			System.out.println("Liczba z poza zakresu.");
		
		else if(number < 0 ) 			
			printNumbers(MIN_NUMBER,number);
		
		else 			
			printNumbers(number,MAX_NUMBER);

		scanner.close();
	}

}
