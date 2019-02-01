package pl.mazurmarcin.javastart.lecture8.homework;

public class SumOfDigits {

	public static int getSumOfDigits(int number) {

		int sum = 0;

		while (number > 0) {
			sum += number % 10;
			number /= 10;
		}

		return sum;
	}
	
	public static int getSumOfDigitsRecursion(int number) {

		if(number == 0)
			return 0;
		else 
			return number % 10 + getSumOfDigitsRecursion(number/10);

	}
	
	public static int getSumOfDigitsRecursionShortVersion(int number) {
		
		return (number == 0) ? 0 : number % 10 + getSumOfDigitsRecursion(number/10);	

	}
	
	

}
