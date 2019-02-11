package pl.mazurmarcin.javastart.lecture10.homework.shapes;

public class Ball extends Shape3D {

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Ball(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculate() {
		return (4 / 3) * Math.PI * Math.pow(radius, 3);
	}

	@Override
	public String toString() {
		return String.format("Kula o promieniu wynoszącym %f, ma objętość: %.2f", radius, calculate());
	}

	@Override
	public String getValues() {
		return ""+radius;
	}

}
