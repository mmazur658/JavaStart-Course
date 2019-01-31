package pl.mazurmarcin.javastart.lecture8;

import java.util.Arrays;
import java.util.Random;

public class ArrayFixing {

	private static final int MAX = 10;

	private static int[] reverseArray(int[] array) {

		int[] newArray = new int[array.length];

		for (int i = 0; i < newArray.length; i++)
			newArray[i] = array[array.length - 1 - i];

		return newArray;
	}

	private static int[] fillArrayWithRandomNumbers(int[] array) {

		Random random = new Random();

		for (int i = 0; i < array.length; i++)
			array[i] = random.nextInt(MAX);

		return array;

	}

	private static int countGivenNumber(int[] array, int number) {

		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == number)
				count++;
		}

		return count;
	}

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };

		System.out.println("Odwrócona tablica: " + Arrays.toString(reverseArray(array)));

		int[] array2 = new int[8];
		System.out.println("Przed wype³nieniem: " + Arrays.toString(array2));
		fillArrayWithRandomNumbers(array2);
		System.out.println("Po wype³nieniu: " + Arrays.toString(array2));

		int numberToCount = 5;
		System.out.println("Iloœæ liczby " + numberToCount + " w tablicy: " + countGivenNumber(array2, numberToCount));

	}

}
