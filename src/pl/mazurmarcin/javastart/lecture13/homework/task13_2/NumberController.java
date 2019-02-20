package pl.mazurmarcin.javastart.lecture13.homework.task13_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NumberController {

	public List<Integer> createListWithNumbersFromFile(String fileName) {

		List<Integer> numbers = new ArrayList<>();

		try (BufferedReader bf = new BufferedReader(new FileReader(new File(fileName)))) {

			String line = null;

			while ((line = bf.readLine()) != null) {

				try {
					numbers.add(Integer.parseInt(line));
				} catch (NumberFormatException e) {
					System.out.println("Nieprawidłowy format danych, wiersz zostanie pominięty.");
				}

			}

		} catch (FileNotFoundException exception) {
			System.out.println("Brak pliku o podanej nazwie");
		} catch (IOException exception) {
			System.out.println("Błąd odczytu danych");
		}

		return numbers;

	}

	public int countNumbers(List<Integer> numbers, int number) {

		int count = 0;

		for (Integer num : numbers) {
			if (num == number)
				count++;
		}

		return count;
	}

}
