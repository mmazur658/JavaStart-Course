package pl.mazurmarcin.javastart.lecture8;

class NumberHelper {

	public static int reverseNumber(int number) {

		int[] array = splitNumber(number);

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < array.length; i++)
			sb.append(array[i]);

		return Integer.valueOf(sb.toString());

	}

	private static int[] splitNumber(int number) {

		int[] array = new int[getNumberOfDigits(number)];

		for (int i = 0; i < array.length; i++) {
			array[i] = number % 10;
			number /= 10;
		}

		return array;

	}

	private static int getNumberOfDigits(int number) {

		int count = 0;

		while (number > 0) {
			count++;
			number = number / 10;
		}

		return count;
	}

}
