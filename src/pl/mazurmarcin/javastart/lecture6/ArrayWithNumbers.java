package pl.mazurmarcin.javastart.lecture6;

import java.util.Scanner;

public class ArrayWithNumbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Podaj rozmiar tablicy: ");
		double[] arr = new double[scanner.nextInt()];

		System.out.println("Wype³nij tablicê wartoœciami");
		for (int i = 0; i < arr.length; i++)
			arr[i] = scanner.nextDouble();
		
		double sum =0;
		for (double d : arr) 
			sum += d;
			
		System.out.println("\nSuma podanych liczb to: "+sum+"\n");
		scanner.close();

	}

}
