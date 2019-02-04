package pl.mazurmarcin.javastart.zadania.tablice_i_sterowanie;

import java.util.Arrays;

public class ArrayUtilsTest {

	public static void main(String[] args) {

		ArrayUtils arrayUtils = new ArrayUtils();

		int[][] array1 = { { 1, 5, 9 }, { 1, 9, 18 }, { 2, 4, 9 }, { 8, 5, 3 } };
		int[][] array2 = { { 18, 15, 9 }, { 1, 9, 18 }, { 29, 4, 9 }, { 8, 55, 3 } };
		int[][] arrayWithBiggestSum = arrayUtils.returnArrayWithBiggestSum(array1, array2);
		System.out.println(Arrays.deepToString(arrayWithBiggestSum));

		String[] stringArray1 = { "Kot", "Pies", "Krowa" };
		String[] stringArray2 = { "Marcin", "Anna", "Michał" };
		String[] arrayContainingMoreLetters = arrayUtils.returnArraysContainingMoreLetters(stringArray1, stringArray2);
		System.out.println(Arrays.deepToString(arrayContainingMoreLetters));

		int[] smallArray = { 1, 5, 9, 7, 6, 8 };
		int min = arrayUtils.returnLowestValue(smallArray);
		int max = arrayUtils.returnBiggestValue(smallArray);
		System.out.println("Najmniejsza: " + min + ", największa: " + max);
		
		int[][] bigArray = { { 1, 5, 9 }, { 1, 9, 18 }, { 2, 4, 9 }, { 8, 5, 3 } };
		int[] extractedArrayWithBiggestSum = arrayUtils.extractArrayWithBiggestSum(bigArray);
		System.out.println(Arrays.toString(extractedArrayWithBiggestSum));
		

	}

}
