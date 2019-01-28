package pl.mazurmarcin.javastart.basic.chapter22;

public class Rectangle implements Shape {

	private double a;
	private double b;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public double calculateArea() {
		return a * b;
	}

	@Override
	public double calculatePerimeter() {
		return (2 * a) + (2 * b);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Prostok¹t, bok A: " + a);
		sb.append(", bok B: " + b);
		sb.append(", obwód: " + calculatePerimeter());
		sb.append(", pole: " + calculateArea());
		return sb.toString();
	}

}
