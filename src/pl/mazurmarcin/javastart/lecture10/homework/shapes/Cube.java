package pl.mazurmarcin.javastart.lecture10.homework.shapes;

public class Cube extends Shape3D {

	private int a;

	public Cube(int a) {
		this.a = a;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	@Override
	public double calculate() {
		return Math.pow(a, 3);
	}

	@Override
	public String toString() {
		return String.format("Sześcian o długości krawędzi wynoszącej A: %d ma pojemność %.2f " , a, calculate());

	}

	@Override
	public String getValues() {
		return ""+a;
	}

}
