package pl.mazurmarcin.javastart.lecture7;

import java.util.Random;
import java.util.stream.IntStream;

public class SumOfRandomNumbers {

	public static void main(String[] args) {

		Random random = new Random();

		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++)
			numbers[i] = random.nextInt(100);

		double sum = IntStream.of(numbers).sum();
		double average = sum / numbers.length;

		int lessThenAverangeSum = 0;
		int biggerThenAverangeSum = 0;

		for (int number : numbers) {

			if (number < average)
				lessThenAverangeSum += number;
			else if (number > average)
				biggerThenAverangeSum += number;
		}

		System.out.println(average);
		System.out.println(lessThenAverangeSum);
		System.out.println(biggerThenAverangeSum);

	}

}
