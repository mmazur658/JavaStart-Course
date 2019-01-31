package pl.mazurmarcin.javastart.podstawy.klasy_wewnetrzne;

import java.util.Arrays;

public class ArraySorter {

	public static void main(String[] args) {

		Sortable sorter = new Sortable() {

			@Override
			public void sort(int[] array) {

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

		};
		
		
		int[] array = {5,7,9,1,4,6,2,8};
		
		System.out.println("Before sorting: ");
		System.out.println(Arrays.toString(array));
		
		sorter.sort(array);
		
		System.out.println("After sorting: ");
		System.out.println(Arrays.toString(array));


	}

}
