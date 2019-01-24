package pl.mazurmarcin.javastart.lecture5;

import java.util.Scanner;

/**
 * zadanie-java-47
 * @author Marcin Mazur
 *
 */
public class LineTest {

	public static void main(String[] args) {

		LineController lineController = new LineController();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Podaj warto�� pocz�tku i ko�ca pierwszej linii: ");
		Line line1 = new Line(new Point(scanner.nextInt()), new Point(scanner.nextInt()));

		System.out.println("Podaj warto�� pocz�tku i ko�ca drugiej linii: ");
		Line line2 = new Line(new Point(scanner.nextInt()), new Point(scanner.nextInt()));

		lineController.printLongerLine(line1, line2);

	}

}
