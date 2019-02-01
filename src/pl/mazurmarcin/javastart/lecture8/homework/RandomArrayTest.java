package pl.mazurmarcin.javastart.lecture8.homework;

import java.util.Arrays;

public class RandomArrayTest {

	private static final int ARRAY_SIZE = 10;

	public static void main(String[] args) {

		int[] array = new int[ARRAY_SIZE];

		RandomArray.fillArrayWithRandomNumbers(array);

		System.out.println("Pocz�tkowa tablica: "+Arrays.toString(array));
		
		System.out.println("Rozwi�zanie zadania: ");
		RandomArray.printArrayAndReversedArray(array);

	}

}
