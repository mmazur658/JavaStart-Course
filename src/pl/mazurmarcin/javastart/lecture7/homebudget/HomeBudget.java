package pl.mazurmarcin.javastart.lecture7.homebudget;

import java.util.Arrays;
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

	public void showYearlyChart(int chartType) {

		double[] arr = collectYearlyData();

		if (chartType == 1) {

			System.out.println("Zwstawienie roczne wydatków. Jedna * =  " + CHART_SCALE);
			System.out.println("-------------------------------------------------");

			for (int i = 0; i < arr.length; i++)
				System.out.printf("%2d %s \n", i, createChartLine(arr[i]+1));

			System.out.println();

		} else if (chartType == 2) {

			int[] tempArr = new int[12];
			for (int i = 0; i < tempArr.length; i++)
				tempArr[i] = (int) (arr[i] / CHART_SCALE);

			int max = Arrays.stream(tempArr).max().getAsInt();

			System.out.println(max);

			int[][] bigArr = new int[12][max];

			for (int i = 0; i < bigArr.length; i++) {

				for (int j = max - 1; j >= max - tempArr[i]; j--) {
					bigArr[i][j] = 1;
				}

			}

			System.out.println("Zwstawienie roczne wydatków. Jedna * =  " + CHART_SCALE);
			System.out.println("-------------------------------------------------");

			for (int i = 0; i < max; i++) {
				for (int j = 0; j < bigArr.length; j++) {
					if (bigArr[j][i] == 1)
						System.out.print(" * ");
					else
						System.out.print("   ");
				}
				System.out.println();
			}

			System.out.println("-------------------------------------------------");
			System.out.println(" 1  2  3  4  5  6  7  8  9  10 11 12  ");

		} else
			System.out.println("Brak wykresu.");

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
			arr[outGoArr[i].getMonthNumer()-1] += outGoArr[i].getAmount();

		return arr;
	}

}
