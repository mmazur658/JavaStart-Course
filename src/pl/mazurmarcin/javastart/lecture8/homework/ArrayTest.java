package pl.mazurmarcin.javastart.lecture8.homework;

public class ArrayTest {

	public static void main(String[] args) {

		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 1, 2, 3, 4, 5 };
		
		System.out.println(ArrayComparator.compare(array1, array2));

		int[][] bigArray1 = { { 1, 2, 3 }, { 1 }, { 1, 2, 3, 4, 5, 6, 7 } };
		int[][] bigArray2 = { { 1, 2, 3 }, { 1 }, { 1, 2, 3, 4, 5, 6, 7 } };
		
		System.out.println(ArrayComparator.compare(bigArray1, bigArray2));

	}

}

