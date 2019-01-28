package pl.mazurmarcin.javastart.basic.chapter22;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ShapeCalculator {

	private Scanner scanner;
	public static final int RECTANGLE = 1;
	public static final int CIRCLE = 2;
	public static final int TRIANGLE = 3;

	public ShapeCalculator() {
		scanner = new Scanner(System.in);
	}

	public void closeScanner() {
		scanner.close();
	}

	public Rectangle readRectangleleData() throws InputMismatchException {

		double a = 0;
		double b = 0;

		System.out.println("\nPROSTOK¥T");

		try {
			System.out.println("Podaj d³ugoœæ boku A");
			a = scanner.nextDouble();

			System.out.println("Podaj d³ugoœæ boku B");
			b = scanner.nextDouble();

		} catch (InputMismatchException exception) {
			throw exception;
		} finally {
			scanner.nextLine();
		}

		return new Rectangle(a, b);

	}

	public Circle readCircleData() throws InputMismatchException {

		double r = 0;

		System.out.println("\nKO£O");

		try {
			System.out.println("Podaj promieñ ko³a");
			r = scanner.nextDouble();

		} catch (InputMismatchException exception) {
			throw exception;
		} finally {
			scanner.nextLine();
		}

		return new Circle(r);
	}

	public Triangle readTriangleData() throws InputMismatchException {

		double height = 0;
		double a = 0;
		double b = 0;
		double c = 0;

		System.out.println("\nTRÓJK¥T");

		try {
			System.out.println("Podaj wysokoœæ:");
			height = scanner.nextDouble();

			System.out.println("Podaj d³ugoœæ boku A:");
			a = scanner.nextDouble();

			System.out.println("Podaj d³ugoœæ boku: B");
			b = scanner.nextDouble();

			System.out.println("Podaj d³ugoœæ boku: C");
			c = scanner.nextDouble();

		} catch (InputMismatchException exception) {
			throw exception;
		} finally {
			scanner.nextLine();
		}

		return new Triangle(height, a, b, c);
	}

	public Shape createShape() throws NoSuchElementException, InputMismatchException {
		
        try {
        	
            int shapeType = scanner.nextInt();
            scanner.nextLine();
            
            switch (shapeType) {
            case RECTANGLE:
                return readRectangleleData();
            case CIRCLE:
                return readCircleData();
            case TRIANGLE:
                return readTriangleData();
            default:
                throw new NoSuchElementException();
            }
            
        } catch (InputMismatchException exception) {
            throw exception;
        } 

    }
	
	 public void printOptions() {
	        System.out.println("Wybierz figurê, dla której chcesz obliczyæ pole i obwód:");
	        System.out.println(RECTANGLE + " - prostok¹t");
	        System.out.println(CIRCLE + " - ko³o");
	        System.out.println(TRIANGLE + " - trójk¹t");
	    }

}
