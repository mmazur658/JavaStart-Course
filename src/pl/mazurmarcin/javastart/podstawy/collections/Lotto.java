package pl.mazurmarcin.javastart.podstawy.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {

	private static final int MAX_NUMBERS = 6;
	private static final int NUMBER_OF_NUMBERS = 49;

	public int getMaxNumbers() {
		return MAX_NUMBERS;
	}

	private List<Integer> numbers = new ArrayList<>();

	public Lotto() {
		generate();
		randomize();
	}

	private void randomize() {
		Collections.shuffle(numbers);
	}

	private void generate() {
		for (int i = 1; i <= NUMBER_OF_NUMBERS; i++)
			numbers.add(i);
	}

	public int checkResult(List<Integer> userNumbers) {

		int count = 0;
		List<Integer> resultList = numbers.subList(0, MAX_NUMBERS);

		for (Integer integer : resultList) {
			if (userNumbers.contains(integer))
				count++;
		}

		return count;

	}

}
