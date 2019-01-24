package pl.mazurmarcin.javastart.lecture5;

import java.util.Scanner;

public class MathQuiz {

	Scanner scanner = new Scanner(System.in);

	public boolean question1() {

		System.out.println("Jaki jest wynik dzia³ania 3 * 5 ? ");
		return (scanner.nextInt() == 15);

	}

	public boolean question2() {

		System.out.println("Jakie jest pole kwadratu o boku 12 ? ");
		return (scanner.nextInt() == 144);

	}

	public boolean question3() {

		System.out.println("Jaki jest pierwiastek kwadratowy z liczby 15129 ? ");
		int result = scanner.nextInt();
		scanner.close();
		
		return (result == 139);
		
	}


}
