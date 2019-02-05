package pl.mazurmarcin.javastart.lecture8.homework;

public class SumOfDigitsTest {
	
	public static void main(String[] args) {
		
		int number = 1234;

		long startTime = System.currentTimeMillis();
		System.out.println("V1 Suma:" + "" + " " + SumOfDigits.getSumOfDigits(number));
		long endTime = System.currentTimeMillis();
		System.out.println("Czas działania: " + (endTime - startTime) + " ms");

		startTime = System.currentTimeMillis();
		System.out.println("V2 Suma: " + SumOfDigits.getSumOfDigitsRecursion(number));
		endTime = System.currentTimeMillis();
		System.out.println("Czas działania: " + (endTime - startTime) + " ms");

		startTime = System.currentTimeMillis();
		System.out.println("V3 Suma: " + SumOfDigits.getSumOfDigitsRecursionShortVersion(number));
		endTime = System.currentTimeMillis();
		System.out.println("Czas działania: " + (endTime - startTime) + " ms");

	}

}
