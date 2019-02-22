package pl.mazurmarcin.javastart.lecture14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListWithNumbers {

	private static final String FILE_NAME = "numbers66.txt";

	private static List<Integer> numbersFromFile() {

		List<Integer> numbers = new ArrayList<>();

		try (Scanner scanner = new Scanner(new File(FILE_NAME))) {

			while (scanner.hasNextInt()) {
				numbers.add(scanner.nextInt());
			}

		} catch (FileNotFoundException e) {
			System.out.println("Plik nie został odnaleziony");
		}

		return numbers;

	}

	public static void main(String[] args) {

		List<Integer> numbers = numbersFromFile();

		Collections.sort(numbers);
		System.out.println(numbers);

		System.out.println("Najmniejsza: " + numbers.get(0));
		System.out.println("Największa: " + numbers.get(numbers.size() - 1));
		System.out.println("Pierwszy index liczby 15: " + numbers.indexOf(15));

	}

}
