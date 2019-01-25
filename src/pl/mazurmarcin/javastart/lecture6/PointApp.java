package pl.mazurmarcin.javastart.lecture6;

import java.util.Scanner;

public class PointApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		PointController pointController = new PointController();
		Point point = new Point();

		System.out.println("Podaj wsp�rz�dne punktu (X, Y) ");
		point.setX(scanner.nextInt());
		point.setY(scanner.nextInt());

		System.out.printf("Punkt ( %d , %d ) le�y w %s �wiartce uk�adu wsp�rz�dnych \n", point.getX(), point.getY(),
				pointController.quarter(point));

		scanner.close();
	}

}
