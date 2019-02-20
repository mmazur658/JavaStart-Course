package pl.mazurmarcin.javastart.lecture13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class SetApp {

	private static final String FILE_NAME = "numbers2.txt";

	private static List<Integer> getNumbersFromFile() {

		List<Integer> list = new ArrayList<>();

		try (Scanner scanner = new Scanner(new File(FILE_NAME))) {

			while (scanner.hasNextInt())
				list.add(scanner.nextInt());

		} catch (FileNotFoundException exception) {
			System.out.println("Plik nie został odnaleziony");
		}

		return list;
	}

	public static void main(String[] args) {

		List<Integer> list = getNumbersFromFile();
		TreeSet<Integer> set = new TreeSet<>(list);

		System.out.println("Number of numbers in file: " + list.size());
		System.out.println("Number of unique numbers in file: " + set.size());
		System.out.println("The lowest number: " + set.first());
		System.out.println("The biggest number: " + set.last());

	}

}
