package pl.mazurmarcin.javastart.zadania.zmienne_i_typy_danych;

import java.util.ArrayList;
import java.util.List;

public class NumberArgs {

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("Brak argumentów. Koniec programu. ");
			return;
		}

		printNumberOfArgs(args);
		printArgs(args);

		int[] intArray = convertArrayFromStringToInt(args);

		printSquares(intArray);
		
		printSum(intArray);

	}

	private static void printSum(int[] intArray) {

		List<String> stringList = new ArrayList<>();
		int sum = 0;
		for (int number : intArray) {
			stringList.add(Integer.toString(number));
			sum += number;
		}
		String leftSideSum = String.join("+", stringList);
		System.out.printf("%s=%d\n", leftSideSum, sum);

	}

	private static void printSquares(int[] intArray) {
		for (int number : intArray)
			System.out.println(number * number);

	}

	private static void printNumberOfArgs(String[] args) {
		System.out.println("Liczba argumentów: " + args.length);

	}

	private static void printArgs(String[] args) {
		for (String arg : args)
			System.out.println(arg);

	}

	private static int[] convertArrayFromStringToInt(String[] stringArray) {

		int[] intArray = new int[stringArray.length];
		for (int i = 0; i < stringArray.length; i++)
			intArray[i] = Integer.valueOf(stringArray[i]);

		return intArray;

	}
}
