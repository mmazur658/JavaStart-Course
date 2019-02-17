package pl.mazurmarcin.javastart.lecture12.homework.task12_2;

import java.util.Random;

public class ArrayOperator {

	private Random random = new Random();
	private final int LOWER_BOUND = 5;
	private final int UPPER_BOUND = 20;

	public int getRandomSize() {
		return random.nextInt((UPPER_BOUND - LOWER_BOUND) + 1) + LOWER_BOUND;
	}

	public void fillArrayWithRandomValues(int[] array) {

		for (int i = 0; i < array.length; i++)
			array[i] = random.nextInt((UPPER_BOUND - LOWER_BOUND) + 1) + LOWER_BOUND;

	}

	public int[] getSplittedArray(int[] array, int parts) {

		if (array == null)
			throw new NullPointerException();

		if (parts > array.length)
			throw new ArrayIndexOutOfBoundsException();

		int[] splittedArray = new int[parts];
		int separator = 0;

		if (array.length % parts == 0) {

			separator = array.length / parts;
			calcNewValues(array, splittedArray, separator);

		} else {

			int addedValue = 0;

			while ((array.length + addedValue) % parts != 0)
				addedValue++;

			separator = (array.length + addedValue) / parts;
			calcNewValues(array, splittedArray, separator);

		}

		return splittedArray;
	}

	private void calcNewValues(int[] array, int[] splittedArray, int separator) {

		int index = 0;

		for (int i = 0; i < array.length; i++) {
			if (i > 0 && i % separator == 0)
				index++;

			splittedArray[index] += array[i];
		}

	}

}
