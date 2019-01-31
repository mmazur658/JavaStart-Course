package pl.mazurmarcin.javastart.lecture7.homebudget;

import java.util.HashSet;
import java.util.Set;

public class HomeBudget {

	private static final int ARRAY_SIZE = 20;
	private static final int CHART_SCALE = 100;
	private int nubmerOfOutgo = 0;

	private Outgo[] outGoArr = new Outgo[ARRAY_SIZE];

	public void add(Outgo outgo) {

		if (nubmerOfOutgo < ARRAY_SIZE) {
			outGoArr[nubmerOfOutgo] = outgo;
			nubmerOfOutgo++;
		} else
			System.out.println("Nie mo¿na dodaæ wiêcej wydatków");
	}

	public void printOutgoes() {
		for (int i = 0; i < nubmerOfOutgo; i++) {
			System.out.println((i + 1) + ". " + outGoArr[i].toString());

		}
	}

	public void showOutgoesBiggerThenGivenValue(double amount) {

		boolean hasAnyResult = false;

		for (int i = 0; i < nubmerOfOutgo; i++) {
			if (outGoArr[i].getAmount() >= amount) {
				System.out.println(outGoArr[i]);
				hasAnyResult = true;
			}
		}

		if (!hasAnyResult)
			System.out.println("Brak wydatków wiêkszych ni¿ " + amount);

	}

	public void showMonthlyOutgoes(int monthNumber) {

		boolean hasAnyResult = false;

		for (int i = 0; i < nubmerOfOutgo; i++) {
			if (outGoArr[i].getMonthNumer() == monthNumber) {
				System.out.println(outGoArr[i]);
				hasAnyResult = true;
			}
		}

		if (!hasAnyResult)
			System.out.println("Brak wydatków w miesi¹cu: " + monthNumber);

	}

	public void showYearlyChart() {

		double[] arr = collectYearlyData();

		System.out.println("Zwstawienie roczne wydatków. Jedna * =  " + CHART_SCALE);
		System.out.println("-------------------------------------------------");

		for (int i = 0; i < arr.length; i++)
			System.out.printf("%2d %s \n", i, createChartLine(arr[i]));
		
		System.out.println();

	}

	private String createChartLine(double totalMonthlyAmount) {

		StringBuilder sb = new StringBuilder();

		sb.append(" | ");

		for (int i = 0; i < (int) (totalMonthlyAmount / CHART_SCALE); i++) {
			sb.append(" *");
		}

		return sb.toString();
	}

	public void printUniqueTypes() {

		Set<String> setOfTypes = new HashSet<String>();

		for (int i = 0; i < nubmerOfOutgo; i++)
			setOfTypes.add(outGoArr[i].getType());

		System.out.println(setOfTypes);

	}

	public void showOutgoesForGivenType(String type) {

		boolean hasAnyResult = false;

		for (int i = 0; i < nubmerOfOutgo; i++) {
			if (outGoArr[i].getType().equals(type)) {
				System.out.println(outGoArr[i]);
				hasAnyResult = true;
			}
		}

		if (!hasAnyResult)
			System.out.println("Brak wydatków dla typu: " + type);

	}

	private double[] collectYearlyData() {

		double[] arr = new double[12];

		for (int i = 0; i < nubmerOfOutgo; i++)
			arr[outGoArr[i].getMonthNumer()] += outGoArr[i].getAmount();

		return arr;
	}

}
