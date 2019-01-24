package pl.mazurmarcin.javastart.lecture5;

/**
 * zadanie-java-60
 * @author Marcin
 *
 */
public class Calculator {

	public int calculate(int firstNumber, int secondNumber) {

		if (firstNumber > secondNumber)
			return (firstNumber + secondNumber);
		else
			return (firstNumber * secondNumber);
	}

}
