package pl.mazurmarcin.javastart.lecture13.homework.task13_1;

import java.util.List;
import java.util.TreeSet;

public class NumbersController {

	public static void main(String[] args) {

		NumbersApp numbersApp = new NumbersApp();

		List<Double> list = numbersApp.createNumberOfList();
		numbersApp.printReversedList(list);
		numbersApp.printSum(list);

		TreeSet<Double> set = new TreeSet<>(list);
		numbersApp.printBiggestValue(set);
		numbersApp.printLowestValue(set);

	}

}
