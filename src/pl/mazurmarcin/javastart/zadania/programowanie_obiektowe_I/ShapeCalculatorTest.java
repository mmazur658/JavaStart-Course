package pl.mazurmarcin.javastart.zadania.programowanie_obiektowe_I;

public class ShapeCalculatorTest {
	
	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(new Point(0,0), new Point(6,0),new Point(6,5),new Point(0,5));
		System.out.println("Pole prostok¹ta: "+ShapeCalculator.rectangleArea(rectangle));
		
		Circle circle = new Circle(new Point (0,0), 5);
		Point ok = new Point(0,3);
		Point notOk = new Point(0,6);
		
		System.out.println("Czy punkt "+ok+" le¿y w okrêgu? " + ShapeCalculator.isPointInsideCircle(circle, ok));
		System.out.println("Czy punkt "+notOk+" le¿y w okrêgu? " + ShapeCalculator.isPointInsideCircle(circle, notOk));
	}

}
