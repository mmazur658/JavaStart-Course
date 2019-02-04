package pl.mazurmarcin.javastart.zadania.tablice_i_sterowanie;

import java.util.Arrays;

public class ArrayUtils {

	public int[][] returnArrayWithBiggestSum(int[][] array1, int[][] array2) {
		return getSumOfArray(array1) >= getSumOfArray(array2) ? array1 : array2;
	}

	public String[] returnArraysContainingMoreLetters(String[] array1, String[] array2) {
		return getNumberOfLetters(array1) >= getNumberOfLetters(array2) ? array1 : array2;
	}

	public int returnBiggestValue(int[] array) {
		return Arrays.stream(array).max().getAsInt();
	}

	public int returnLowestValue(int[] array) {
		return Arrays.stream(array).min().getAsInt();
	}

	public int[] extractArrayWithBiggestSum(int[][] bigArray) {

		int biggestIndex = 0;
		int biggestSum = 0;
		int tempSum = 0;

		for (int i = 0; i < bigArray.length; i++) {

			tempSum = getSumOfArray(bigArray[i]);

			if (tempSum >= biggestSum) {
				biggestIndex = i;
				biggestSum = tempSum;
			}
		}
		
		return bigArray[biggestIndex];

	}

	private int getNumberOfLetters(String[] array) {

		int sum = 0;

		for (String word : array)
			sum += word.length();

		return sum;
	}

	private int getSumOfArray(int[][] array) {

		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)
				sum += array[i][j];
		}

		return sum;
	}

	private int getSumOfArray(int[] array) {

		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		return sum;
	}

}
