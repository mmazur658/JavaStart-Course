package pl.mazurmarcin.javastart.lecture13.homework.task13_2;

import java.util.List;
import java.util.TreeSet;

public class NumbersFromFileApp {

	private final static String FILE_NAME = "numbers2.txt";

	public static void main(String[] args) {

		NumberController numberController = new NumberController();

		List<Integer> numbers = numberController.createListWithNumbersFromFile(FILE_NAME);
		TreeSet<Integer> set = new TreeSet<>(numbers);
		
		for (Integer number : set) 
			System.out.println(number+" - liczba wystąpień: "+numberController.countNumbers(numbers, number));	
				
	}

}
