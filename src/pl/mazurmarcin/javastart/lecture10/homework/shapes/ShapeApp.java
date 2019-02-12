package pl.mazurmarcin.javastart.lecture10.homework.shapes;

public class ShapeApp {

	private static ShapeCalculator shapeCalculator = new ShapeCalculator();

	private static final String Rectangle = "Rectangle";
	private static final String Line2D = "Line2D";
	private static final String Circle = "Circle";
	private static final String Ball = "Ball";
	private static final String Cube = "Cube";

	private static void printResult(String className, String values, double result) {

		switch (className) {
		case Rectangle:
			System.out.println("Prostokąt o bokach " + values + " ma pole " + result);
			break;
		case Line2D:
			System.out.println("Odcinek wyznaczony przez współrzędne " + values + " ma długość " + result);
			break;
		case Circle:
			System.out.println("Koło o promieniu wynoszącym " + values + " ma pole " + result);
			break;
		case Ball:
			System.out.println("Kula o promieniu wynoszącym " + values + " ma objętość: " + result);
			break;
		case Cube:
			System.out.println("Sześcian o długości krawędzi wynoszącej " + values + " ma pojemność " + result);
			break;
		default:
			System.out.println("Kształt nierozpoznany");
		}

	}

	private static void calculateShape(Shape shape) {

		String className = shape.getClass().getSimpleName();
		String values = shape.getValues();

		if (shape instanceof GeometricShape)
			printResult(className, values, shapeCalculator.shapeArea((GeometricShape) shape));

		else if (shape instanceof Line2D)
			printResult(className, values, shapeCalculator.lineLength((Line2D) shape));

		else if (shape instanceof Shape3D)
			printResult(className, values, shapeCalculator.volume((Shape3D) shape));

		else
			System.out.println("Kształt nierozpoznany");
	}

	public static void main(String[] args) {

		Shape[] shapes = new Shape[5];
		shapes[0] = new Line2D(new Point(2, 2), new Point(4, 2));
		shapes[1] = new Circle(5);
		shapes[2] = new Rectangle(2, 5);
		shapes[3] = new Ball(5);
		shapes[4] = new Cube(5);

		for (Shape shape : shapes)
			System.out.println(shape);

		System.out.println("\n");

		for (Shape shape : shapes)
			calculateShape(shape);

	}

}
