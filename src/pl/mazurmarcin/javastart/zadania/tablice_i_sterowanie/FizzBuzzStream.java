package pl.mazurmarcin.javastart.zadania.tablice_i_sterowanie;

import java.util.stream.IntStream;

public class FizzBuzzStream {

	private static void fizzBuzz(int number) {

		if (number % 15 == 0)
			System.out.println(number + " FizzBuzz");
		else if (number % 3 == 0)
			System.out.println(number + " Fizz");
		else if (number % 5 == 0)
			System.out.println(number + " Buzz");

	}

	public static void main(String[] args) {

		IntStream.iterate(1, i -> i + 1).limit(100).forEach(FizzBuzzStream::fizzBuzz);

		IntStream.rangeClosed(1, 100).forEach(number -> {

			if (number % 15 == 0)
				System.out.println(number + " FizzBuzz");
			else if (number % 3 == 0)
				System.out.println(number + " Fizz");
			else if (number % 5 == 0)
				System.out.println(number + " Buzz");

		});
	}

}
