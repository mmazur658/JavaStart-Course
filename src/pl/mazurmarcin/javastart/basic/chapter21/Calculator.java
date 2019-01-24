package pl.mazurmarcin.javastart.basic.chapter21;

public class Calculator {

	public final String PLUS = "+";
	public final String MINUS = "-";
	public final String MULTIPLY = "*";
	public final String DIVIDE = "/";

	public double calculate(double a, double b, String operator) {

		double result = 0;

		switch (operator) {
		case PLUS:
			result = a + b;
			break;
		case MINUS:
			result = a - b;
			break;
		case MULTIPLY:
			result = a * b;
			break;
		case DIVIDE:
			if (b == 0)
				throw new ArithmeticException("You can`t divide by 0");

			result = a / b;
			break;
		default:
			throw new UnknownOperatorException("Unknown mathematic operatior");

		}

		return result;
	}

}
