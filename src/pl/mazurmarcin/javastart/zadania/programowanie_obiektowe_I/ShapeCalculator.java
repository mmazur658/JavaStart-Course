package pl.mazurmarcin.javastart.zadania.programowanie_obiektowe_I;

public class ShapeCalculator {

	public static double rectangleArea(Rectangle rectangle) {

		return lineLength(rectangle.getPoint1(), rectangle.getPoint2())
				* lineLength(rectangle.getPoint1(), rectangle.getPoint4());

	}

	public static boolean isPointInsideCircle(Circle circle, Point point) {

		double result = Math.pow((circle.getPoint().getX() - point.getX()), 2)
				+ Math.pow((circle.getPoint().getY() - point.getY()), 2);
		double radiusPow = Math.pow(circle.getRadius(), 2);

		return result <= radiusPow;

	}

	public static double lineLength(Point start, Point end) {

		double xPow = Math.pow(end.getX() - start.getX(), 2);
		double yPow = Math.pow(end.getY() - start.getY(), 2);
		double xyPowSum = xPow + yPow;

		return Math.sqrt(xyPowSum);
	}

}
