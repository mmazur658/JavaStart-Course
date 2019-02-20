package pl.mazurmarcin.javastart.lecture13;

import java.util.List;

public class NumberListApp {

	public static void main(String[] args) throws IllegalAccessException {

		NumbeListController numbeListController = new NumbeListController();
		List<Double> list = numbeListController.createListWithNumbers(10);

		System.out.println("Basic List: \n" + list.toString());
		System.out.println("Reversed List: "+numbeListController.getReversedList(list).toString());

		System.out.println("Biggest Value: " + numbeListController.getBiggestNumber(list));
		System.out.printf("Sum: %.2f \n", numbeListController.getSumOfNumbersWithEvenIndexes(list));
		System.out.printf("Product: %.2f \n", numbeListController.getProductOfNumbersWithOddIndexes(list));

	}

}
