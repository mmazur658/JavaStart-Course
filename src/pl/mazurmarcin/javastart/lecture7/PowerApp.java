package pl.mazurmarcin.javastart.lecture7;

/**
 * @author Marcin Mazur
 */
public class PowerApp {

	private static final int POWER = 5;
	private static final int START_NUMBER = 10;
	private static final int RANGE = 200000;

	public static void main(String[] args) {

		PowerHelper powerHelper = new PowerHelper();
		int number = START_NUMBER;
		int bigSum = 0;
		int tempSum = 0;

		while (number < RANGE) {

			tempSum = powerHelper.getSum(number, POWER);

			if (number == tempSum) {
				System.out.println(number);
				bigSum += tempSum;
			}

			number++;
		}

		System.out.println("Suma: " + bigSum);

	}

}
