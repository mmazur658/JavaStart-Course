package pl.mazurmarcin.javastart.zadania.kolekcje;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WarehouseDataReader {

	private static final String FILE_NAME = "data.csv";

	private List<String> readDataFromFile() {

		try {

			return Files.readAllLines(Paths.get(FILE_NAME));

		} catch (IOException exception) {
			System.out.println("Error during reading data");
			exception.printStackTrace();
		}

		return new ArrayList<>();
	}

	public Map<String, Integer> readProductsFromFile() {

		List<String> warehouseProductsList = readDataFromFile();
		Map<String, Integer> warehouseStock = new HashMap<>();

		for (String line : warehouseProductsList) {
			String[] splitedData = line.split(";");
			warehouseStock.put(splitedData[0], Integer.valueOf(splitedData[1]));
		}

		return warehouseStock;

	}

	
}
