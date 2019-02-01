package pl.mazurmarcin.javastart.lecture8.homework;

import java.util.Random;

public class RandomArray {

	public static void fillArrayWithRandomNumbers(int[] array) {

		Random random = new Random();

		for (int i = 0; i < array.length; i++)
			array[i] = random.nextInt(100);

	}

	public static void printArrayAndReversedArray(int[] array) {

		for (int i = 0; i < (array.length * 2); i++) {

			if (i >= array.length)
				System.out.print(array[((array.length * 2) - 1) - i]+" ");
			else
				System.out.print(array[i]+" ");

		}

	}

}
