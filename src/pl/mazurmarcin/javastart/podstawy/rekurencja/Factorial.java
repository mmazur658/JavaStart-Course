package pl.mazurmarcin.javastart.podstawy.rekurencja;

public class Factorial {

	private static int factorial(int number) {
		return number > 1 ? number * factorial(number - 1) : number;
	}

	public static void main(String[] args) {

		int factorialArgument = 5;
		System.out.println("Silnia z "+factorialArgument+" = "+factorial(factorialArgument));

	}

}
