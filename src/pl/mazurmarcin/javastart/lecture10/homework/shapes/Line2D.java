package pl.mazurmarcin.javastart.lecture10.homework.shapes;

public class Line2D extends Shape2D {

	private Point point1;
	private Point point2;

	public Line2D(Point point1, Point point2) {
		this.point1 = point1;
		this.point2 = point2;
	}

	public Point getPoint1() {
		return point1;
	}

	public void setPoint1(Point point1) {
		this.point1 = point1;
	}

	public Point getPoint2() {
		return point2;
	}

	public void setPoint2(Point point2) {
		this.point2 = point2;
	}

	@Override
	public double calculate() {

		int x1 = point1.getX();
		int x2 = point2.getX();

		int y1 = point1.getY();
		int y2 = point2.getY();

		return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	}

	@Override
	public String toString() {
		
		return String.format("Odcinek wyznaczony przez współrzędne [%d, %d] [%d, %d] ma długość %.2f", point1.getX(), point1.getY(),
				point2.getX(), point2.getY(), calculate());

	}

	@Override
	public String getValues() {
		return "["+point1.getX()+", "+point1.getY()+"] ["+point2.getX()+", "+point1.getY()+"]";
	}

}
