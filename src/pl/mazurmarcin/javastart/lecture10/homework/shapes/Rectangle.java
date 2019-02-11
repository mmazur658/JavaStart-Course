package pl.mazurmarcin.javastart.lecture10.homework.shapes;

public class Rectangle extends GeometricShape {

	private int a;
	private int b;

	public Rectangle(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public double calculate() {
		return a * b;
	}

	@Override
	public String toString() {
		return String.format("Prostokąt o bokach A: %d i B: %d, ma pole: %.2f", a, b, calculate());
	}

	@Override
	public String getValues() {
		return a+" i "+b;
	}

}
