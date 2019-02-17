package pl.mazurmarcin.javastart.lecture12.homework.task12_2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayOperator arrayOperator = new ArrayOperator();
		int[] array = new int[arrayOperator.getRandomSize()];
		arrayOperator.fillArrayWithRandomValues(array);

		System.out.println("Base array - length: " + array.length + "\n" + Arrays.toString(array));

		System.out.println("For how many parts do you want to split the array?");
		int parts = scanner.nextInt();

		int[] splittedArray = arrayOperator.getSplittedArray(array, parts);

		System.out.println("Splitted array - length: " + splittedArray.length + "\n" + Arrays.toString(splittedArray));

		scanner.close();
	}

}
