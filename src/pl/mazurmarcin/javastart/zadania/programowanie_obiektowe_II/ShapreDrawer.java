package pl.mazurmarcin.javastart.zadania.programowanie_obiektowe_II;

import java.util.Scanner;

public class ShapreDrawer {

	private static final String RECTANGLE = "rectangle";
	private static final String SQUARE = "square";
	private static final String TREE = "tree";

	private static Scanner scanner = new Scanner(System.in);

	private static Rectangle readAndCreateRectangle() {

		System.out.println("Poda długość boku A: ");
		int a = scanner.nextInt();

		System.out.println("Poda długość boku B: ");
		int b = scanner.nextInt();

		return new Rectangle(a, b);

	}

	private static Square readAndCreateSquare() {

		System.out.println("Poda długość boku A: ");
		int a = scanner.nextInt();

		return new Square(a);
	}

	private static Tree readAndCreateTree() {

		System.out.println("Poda wysokość: ");
		int height = scanner.nextInt();

		return new Tree(height);

	}

	private static Drawable readAndCreateShape() {

		Drawable drawable = null;

		System.out.println("Co chcesz narysować (rectangle - square - tree)");
		String shape = scanner.nextLine();

		switch (shape) {
		case RECTANGLE:
			drawable = readAndCreateRectangle();
			break;
		case SQUARE:
			drawable = readAndCreateSquare();
			break;
		case TREE:
			drawable = readAndCreateTree();
			break;
		default:
			System.out.println("Nierozpoznany kształt");
		}

		scanner.close();
		return drawable;

	}

	public static void main(String[] args) {

		Drawable drawable = readAndCreateShape();
		drawable.draw();

	}

}
