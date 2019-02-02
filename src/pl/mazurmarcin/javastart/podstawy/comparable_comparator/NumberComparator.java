package pl.mazurmarcin.javastart.podstawy.comparable_comparator;

import java.util.Arrays;
import java.util.Comparator;

public class NumberComparator {

	public static void main(String[] args) {

		Integer[] array = { 1, 52, 63, 98, 52, 11, 3, 8, 9, 7, 22, 6, 5, 89, 99, 63, 21, 32, 1, 23 };

		System.out.println("Tablica pocz¹tkowa: ");
		System.out.println(Arrays.toString(array));

		Arrays.sort(array);
		System.out.println("Sortowanie domyœlne rosn¹co: ");
		System.out.println(Arrays.toString(array));

		Arrays.sort(array, new Comparator<Integer>() {

			@Override
			public int compare(Integer object1, Integer object2) {
				return -(object1.compareTo(object2));
			}

		});
		System.out.println("Sortowanie w³asne malej¹ce: ");
		System.out.println(Arrays.toString(array));

	}

}
