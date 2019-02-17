package pl.mazurmarcin.javastart.lecture12.homework.task12_1;

public class ProductApp {

	public static void main(String[] args) {

		ProductFileManager productFileManager = new ProductFileManager();
		Product[] products = productFileManager.importProductsFromCsv();

		ProductCalculator productCalculator = new ProductCalculator();

		System.out.println("Suma wszystkich produktów: " + productCalculator.getSumOfAllProducts(products));
		System.out.println("Najdroższy produkt: " + productCalculator.getTheMostExpensiveProduct(products));
		System.out.println("Najpop. wg nazwy producenta: " + productCalculator.getNameOfMostPopularProducer(products));

	}

}
