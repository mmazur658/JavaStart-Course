package pl.mazurmarcin.javastart.lecture6;

public class SumOfNumbers {

	public static void main(String[] args) {

		int[] arrWithNumbers = { 2, 9, 8, 6, 5 };
		int sum = 0;

		for (int i = 0; i < arrWithNumbers.length; i += 2)
			sum += arrWithNumbers[i];

		System.out.println("Suma 1,3,5 elementu: " + sum);

	}

}
