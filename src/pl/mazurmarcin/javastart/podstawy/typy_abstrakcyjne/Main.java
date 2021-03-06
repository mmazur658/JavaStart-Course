package pl.mazurmarcin.javastart.podstawy.typy_abstrakcyjne;

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
				System.out.println("Nieprawidłowe dane. Rozpocznij od początku.");
			} catch (NoSuchElementException e) {
				System.out.println("Nie ma takiego kształtu.");
			}
		}

		System.out.println(shape);

		shapeCalculator.closeScanner();

	}

}
