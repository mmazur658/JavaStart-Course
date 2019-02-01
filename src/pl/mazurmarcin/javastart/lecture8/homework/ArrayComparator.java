package pl.mazurmarcin.javastart.lecture8.homework;

/**
 * This class is used to compare two arrays.
 * 
 * @author Marcin Mazur
 *
 */
public class ArrayComparator {

	/**
	 * Returns TRUE if the lengths of the arrays are equals and the values from the
	 * arrays on the same index are equals.
	 * 
	 * @param array1
	 *            The array containing the first array to be compared
	 * @param array2
	 *            The array containing the second array to be compared
	 * @return A boolean representing the result of comparing two arrays
	 */
	public static boolean compare(int[] array1, int[] array2) {

		// Returns false if the lengths of the arrays are not equals
		if (array1.length != array2.length)
			return false;

		// Returns false if the values from array1 and array2 on the same index are not
		// the same
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i])
				return false;
		}

		return true;

	}

	/**
	 * Returns TRUE if the lengths of the arrays are equals and the values from the
	 * arrays on the same index are equals.
	 * 
	 * @param array1
	 *            The array containing the first array to be compared
	 * @param array2
	 *            The array containing the second array to be compared
	 * @return A boolean representing the result of comparing two arrays
	 */
	public static boolean compare(int[][] array1, int[][] array2) {

		// Returns false if the lengths of the arrays are not equals
		if (array1.length != array2.length)
			return false;

		// Returns false if the lengths of the inner arrays are not equals
		for (int i = 0; i < array1.length; i++) {
			if (array1[i].length != array2[i].length)
				return false;
		}

		// Returns false if the values from array1 and array2 on the same index are not
		// the same
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				if (array1[i][j] != array2[i][j])
					return false;
			}

		}

		return true;

	}

}
