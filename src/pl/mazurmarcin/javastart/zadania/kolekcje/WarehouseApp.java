package pl.mazurmarcin.javastart.zadania.kolekcje;

import java.util.Map;

public class WarehouseApp {

	public void printStock(Map<String, Integer> warehouseStock) {
		warehouseStock.forEach((k, v) -> {
			System.out.printf("%-30s (%d) %s\n", k, v, getStars(v));
		});
	}

	private String getStars(int number) {

		int starsNumber = (number + 5) / 10;

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < starsNumber; i++)
			sb.append("*");

		return sb.toString();
	}

}
