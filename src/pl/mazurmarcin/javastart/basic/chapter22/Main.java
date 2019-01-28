package pl.mazurmarcin.javastart.basic.chapter22;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {

		ShapeCalculator shapeCalculator = new ShapeCalculator();

		Shape shape = null;

		boolean readComplete = false;

		while (!readComplete) {
			
			try {
				
				shapeCalculator.printOptions();
				shape = shapeCalculator.createShape();
				readComplete = true;
				
			} catch (InputMismatchException e) {
				System.out.println("Nieprawid�owe dane. Rozpocznij od pocz�tku.");
			} catch (NoSuchElementException e) {
				System.out.println("Nie ma takiego kszta�tu.");
			}
		}

		System.out.println(shape);

		shapeCalculator.closeScanner();

	}

}
