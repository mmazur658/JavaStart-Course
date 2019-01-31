package pl.mazurmarcin.javastart.lecture7;

/**
 * Rozwi¹zanie dla potêgi 5: 4150, 4151, 54748, 92727, 93084, 194979.
 * (sprawdzone do 10 000 000 )
 * 
 * @author Marcin Mazur
 *
 */
public class Exponentiation {

	private static final int POWER = 5;
	private static final int START_NUMBER = 10;
	private static final int RANGE = 10000000;

	private static int sum(int number, int power) {

		int tempValue = 0;
		int sum = 0;

		while (number > 0) {

			tempValue = number % 10;
			sum += Math.pow(tempValue, power);
			number = (number - tempValue) / 10;

		}

		return sum;
	}

	public static void main(String[] args) {

		int number = START_NUMBER;

		while (number < RANGE) {

			if (number == sum(number, POWER))
				System.out.println(number);

			number++;
		}

	}

}
