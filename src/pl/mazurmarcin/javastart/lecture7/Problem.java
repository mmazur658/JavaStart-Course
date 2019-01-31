package pl.mazurmarcin.javastart.lecture7;

import java.util.Arrays;
import java.util.Random;

public class Problem {

	private static final int ARRAY_SIZE = 100;
	private static final int RANGE = 1000;
	
	public static void main(String[] args) {

		Problem problem = new Problem();
		int[] tab = problem.generateArray();
		int[] uniqueElements = problem.getUniqueElements(tab);
		
		Arrays.sort(uniqueElements);

		System.out.println(Arrays.toString(uniqueElements));
	}

	private int[] generateArray() {

		int[] array = new int[ARRAY_SIZE];
		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(RANGE);
		}

		return array;
	}

	private int[] getUniqueElements(int[] array) {

		int[] unique = new int[ARRAY_SIZE];
		int emptyIndex = 0;

		for (int i = 0; i < array.length; i++) {

			if (!checkIfContains(array[i], unique)) {
				unique[emptyIndex] = array[i];
				emptyIndex++;
			}

		}

		return unique;
	}

	private boolean checkIfContains(int number, int[] array) {

		boolean contains = false;
		int i = 0;

		while (!contains && i < array.length) {

			if (array[i] == number)
				contains = true;

			i++;
		}

		return contains;
	}
}