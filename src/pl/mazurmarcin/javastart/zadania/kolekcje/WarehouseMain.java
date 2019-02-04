package pl.mazurmarcin.javastart.zadania.kolekcje;

import java.util.Map;

public class WarehouseMain {

	public static void main(String[] args) {

		WarehouseDataReader warehouseDataReader = new WarehouseDataReader();
		Map<String, Integer> warehouseStock = warehouseDataReader.readProductsFromFile();

		WarehouseApp warehouseApp = new WarehouseApp();
		warehouseApp.printStock(warehouseStock);

	}

}
