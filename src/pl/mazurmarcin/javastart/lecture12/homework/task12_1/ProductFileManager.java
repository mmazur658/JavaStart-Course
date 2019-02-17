package pl.mazurmarcin.javastart.lecture12.homework.task12_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ProductFileManager {

	private final static String FILE_NAME = "produkty.csv";

	public void exportProductsToCsv(Product[] products) {

		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(FILE_NAME)))) {

			for (int i = 0; i < products.length; i++) {
				bufferedWriter.write(products[i].toCsv());
				if (i != products.length - 1)
					bufferedWriter.newLine();
			}

		} catch (FileNotFoundException exception) {
			System.err.println("Plik nie został odnaleziony.");
		} catch (IOException exception) {
			System.err.println("Błąd odczytu danych");
		}

	}

	public Product[] importProductsFromCsv() {

		Product[] products = new Product[getNumberOfRows()];

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(FILE_NAME)))) {

			String line = null;

			for (int i = 0; i < products.length; i++) {
				line = bufferedReader.readLine();
				String[] array = line.split(";");
				products[i] = new Product(array[0], array[1], Double.parseDouble(array[2]));
			}

		} catch (FileNotFoundException exception) {
			System.err.println("Plik nie został odnaleziony.");
		} catch (IOException exception) {
			System.err.println("Błąd odczytu danych");
		}

		return products;

	}

	private int getNumberOfRows() {

		int count = 0;

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(FILE_NAME)))) {

			String line = null;
			while ((line = bufferedReader.readLine()) != null)
				count++;

		} catch (FileNotFoundException exception) {
			System.err.println("Plik nie został odnaleziony.");
		} catch (IOException exception) {
			System.err.println("Błąd odczytu danych");
		}

		return count;
	}

}
