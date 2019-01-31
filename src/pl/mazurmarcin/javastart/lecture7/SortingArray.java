package pl.mazurmarcin.javastart.lecture7;

import java.util.Arrays;
import java.util.Random;

public class SortingArray {

	public void bubbleSort(int[] array) {

		int tempValue = 0;

		for (int i = 0; i < array.length - 1; i++) {

			for (int j = 0; j < array.length - i - 1; j++) {

				if (array[j] > array[j + 1]) {

					tempValue = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tempValue;

				}
			}
		}
	}

	private int[] createAndFillArray(int arraySize, int numberRangeMin, int numberRangeMax) {

		int[] array = new int[arraySize];
		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(numberRangeMax - numberRangeMin) + numberRangeMin;
		}

		return array;
	}

	public static void main(String[] args) {

		SortingArray sortingArray = new SortingArray();

		int[] array = sortingArray.createAndFillArray(10, -10, 10);

		System.out.println("Before sorting: ");
		System.out.println(Arrays.toString(array));

		sortingArray.bubbleSort(array);

		System.out.println("After sorting: ");
		System.out.println(Arrays.toString(array));
	}

}
