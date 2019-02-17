package pl.mazurmarcin.javastart.lecture12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductToFileTest {

	private final static String FILE_NAME = "products.csv";

	private static void exportProductsToCsv(Product[] products, File file) {

		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {

			for (int i = 0; i < products.length; i++) {
				bufferedWriter.write(products[i].toCsv());
				if (i != products.length - 1)
					bufferedWriter.newLine();
			}

		} catch (IOException e) {
			System.out.println("Błąd zapisu danych");
		}

	}

	private static Product[] importProductsFromCsv(File file) {

		List<Product> productsList = new ArrayList<>();

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

			String line = null;

			while ((line = bufferedReader.readLine()) != null) {
				String[] array = line.split(";");
				productsList.add(new Product(array[0], array[1], Double.parseDouble(array[2])));
			}

		} catch (FileNotFoundException exception) {
			System.err.println("Plik nie został odnaleziony.");
		} catch (IOException exception) {
			System.err.println("Błąd odczytu danych");
		}

		return productsList.toArray(new Product[productsList.size()]);

	}

	public static void main(String[] args) throws IOException {

		File file = new File(FILE_NAME);
		if (!file.exists())
			file.createNewFile();

		Product[] products = { new Product("Mleko", "Mlekowita", 2.8), new Product("Czekolada", "Wedel", 3.8),
				new Product("Piwo", "Kompania Piwowarska", 2.5),
				new Product("Masło", "Spółdzielnia Mleczarska Koło", 4.99) };

		System.out.println("Eksport danych do pliku . . . ");
		exportProductsToCsv(products, file);

		System.out.println("Import danych z pliku: ");
		Product[] ImportedProducts = importProductsFromCsv(file);

		System.out.println(Arrays.toString(ImportedProducts));

	}

}
