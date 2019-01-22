package pl.mazurmarcin.javastart.lecture5;

public class NumberChecker {

	public int greatest(int a, int b, int c) {

		// pomyœleæ poprawiæ 
		if (a > b && a > c)
			return a;
		else if (b > a && b > c)
			return b;
		else
			return c;

	}

	public int least(int a, int b, int c) {

		if (a < b && a < c)
			return a;
		else if (b < a && b < c)
			return b;
		else
			return c;
	}

	public double average(int a, int b, int c) {

		return (a+b+c)/3;
	}

}
