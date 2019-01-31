package pl.mazurmarcin.javastart.lecture7;

public class LookingForNumber {
	
	private static final int MAX_NUMBER = 20;

	public static void main(String[] args) {

		int number = 0;
		boolean hasResult = false;

		while (!hasResult) {
			
			number += MAX_NUMBER;			
			hasResult = true;
			
			for (int i = 1; i <= MAX_NUMBER; i++) {

				if (!(number % i == 0))
					hasResult = false;

			}

		}

		System.out.println(number);

	}

}
