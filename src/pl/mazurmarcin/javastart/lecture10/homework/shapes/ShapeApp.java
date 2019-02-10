package pl.mazurmarcin.javastart.lecture10.homework.shapes;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[5];
		shapes[0] = new Line2D(new Point(2,2), new Point(4,2));
		shapes[1] = new Circle(5);
		shapes[2] = new Rectangle(2, 5);
		shapes[3] = new Ball(5);
		shapes[4] = new Cube(5);			
		
		for (Shape shape : shapes) 
			System.out.println(shape);
		
	}

}
