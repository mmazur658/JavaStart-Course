package pl.mazurmarcin.javastart.lecture6;

public class EvenNumbers {

	public static void main(String[] args) {

		int sum1 = 0;

		for (int i = 0; i <= 100; i += 2) {
			System.out.print(i + " ");
			sum1 += i;
		}

		System.out.println("\n\nSuma liczb parzystych: " + sum1 + "\n");

	}

}
