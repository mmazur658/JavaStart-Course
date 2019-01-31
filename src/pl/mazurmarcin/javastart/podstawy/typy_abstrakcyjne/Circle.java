package pl.mazurmarcin.javastart.podstawy.typy_abstrakcyjne;

public class Circle implements Shape {

	private double r;

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double calculateArea() {	
		return Math.PI*r*r;
	}

	@Override
	public double calculatePerimeter() {	
		return 2*Math.PI*r;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ko³o, promieñ " + r);
		sb.append(", obwód: " + calculatePerimeter());
		sb.append(", pole: " + calculateArea());
		return sb.toString();
	}
	
	
	

}
