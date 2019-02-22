package pl.mazurmarcin.javastart.lecture14.homework.task14_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ResultManager {

	private Scanner scanner = new Scanner(System.in);
	private ResultDB resultDB = new ResultDB();
	private final String FILE_NAME = "results.csv";
	private final String STOP_WORD = "stop";

	public void addResults() {

		String userName = null;
		int score = 0;
		Result result = null;

		do {

			System.out.println("Podaj imię kolejnego gracza (lub " + STOP_WORD + " aby zakończyć):");
			userName = scanner.nextLine();

			if (!userName.equals(STOP_WORD)) {

				System.out.println("Podaj wynik: ");
				score = getCorrectInt();
				scanner.nextLine();

				result = new Result(userName, score);
				resultDB.addResult(result);
			}

		} while (!userName.equals(STOP_WORD));

	}

	public void exportToFile() {

		System.out.println("Sortowanie wyników i zapis do pliku . . . ");

		File file = new File(FILE_NAME);
		Collections.sort(resultDB.getResults());

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {

			for (Result result : resultDB.getResults()) {
				bw.write(result.toCsv());
				bw.newLine();
			}
		} catch (IOException exception) {
			System.out.println("Błąd zapisu danych");
		}
	}

	public List<Result> importFromFile() {

		System.out.println("Odczyt wyników z pliku . . . ");

		File file = new File(FILE_NAME);
		List<Result> results = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {

			String line = null;
			while ((line = br.readLine()) != null) {
				String[] tempArr = line.split(";");
				results.add(new Result(tempArr[0], Integer.valueOf(tempArr[1])));
			}

		} catch (FileNotFoundException exception) {
			System.out.println("Plik nie został odnaleziony");
		} catch (IOException exception) {
			System.out.println("Błąd odczytu danych");
		}

		return results;

	}

	private int getCorrectInt() {

		int number = 0;
		boolean isNumberInt = false;

		do {

			try {
				number = scanner.nextInt();
				isNumberInt = true;
			} catch (InputMismatchException exception) {
				System.out.println("Nieprawidłowy format danych. Spróbuj ponownie.");
				scanner.nextLine();
			}

		} while (!isNumberInt);

		return number;

	}

	public void printResults() {
		printResults(resultDB.getResults());
	}

	public void printResults(List<Result> results) {

		for (int i = 0; i < results.size(); i++) {
			System.out.println((i + 1) + ". " + results.get(i).getName() + " " + results.get(i).getScore());

		}
	}

}
