package pl.mazurmarcin.javastart.lecture7;

public class PowerHelper {
	
	public int getSum(int number, int power) {

		int sum = 0;

		while (number > 0) {

			sum += Math.pow(number % 10, power);
			number = number / 10;

		}

		return sum;
	}

}
