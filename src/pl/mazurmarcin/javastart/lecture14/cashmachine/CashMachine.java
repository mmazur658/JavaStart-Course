package pl.mazurmarcin.javastart.lecture14.cashmachine;

import java.util.HashMap;
import java.util.Map;

public class CashMachine {

	private Map<String, Double> denominations;
	private final int MIN_VALUE = 0;
	private final int MAX_VALUE = 500;

	private final String[] DENIMONATIONS_NAMES = { "1GR", "2GR", "5GR", "10GR", "20GR", "50GR", "1ZL", "2ZL", "5ZL",
			"10ZL", "20ZL", "50ZL", "100ZL", "200ZL" };

	private final double[] DENIMONATIONS_VALUES = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 1000, 2000, 5000, 10000,
			20000 };

	public CashMachine() {
		denominations = fillMapWithDenominations();
	}

	private Map<String, Double> fillMapWithDenominations() {

		Map<String, Double> denominations = new HashMap<>();

		for (int i = 0; i < DENIMONATIONS_NAMES.length; i++)
			denominations.put(DENIMONATIONS_NAMES[i], DENIMONATIONS_VALUES[i]);

		return denominations;
	}

	public double getRandomValue() {
		return ((Math.random() * ((MAX_VALUE - MIN_VALUE) + 1)) + MIN_VALUE) * 100;
	}

	public void printDenominationsNames() {

		for (String name : DENIMONATIONS_NAMES)
			System.out.print(name + " ");

		System.out.println();

	}

	public double getBillValue(String billName) {

		if (!denominations.containsKey(billName))
			throw new IllegalArgumentException();

		return denominations.get(billName);
	}

	public String calculateChange(double absoluteValue) {

		StringBuilder sb = new StringBuilder();

		do {
			for (int i = DENIMONATIONS_VALUES.length - 1; i >= 0; i--) {
				if ((absoluteValue - DENIMONATIONS_VALUES[i]) >= 0) {

					sb.append(DENIMONATIONS_NAMES[i]);
					sb.append(" ");
					absoluteValue -= DENIMONATIONS_VALUES[i];
					break;
				}
			}
		} while (absoluteValue >= 1);

		return sb.toString();
	}

}
