package pl.mazurmarcin.javastart.lecture10.homework.shapes;

public class Circle extends GeometricShape {

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculate() {
		return 2 * Math.PI * radius;
	}
	
	@Override
	public String toString() {
		return String.format("Koło o promieniu wynoszącym: %f, ma pole: %.2f", radius, calculate());
	}


}
