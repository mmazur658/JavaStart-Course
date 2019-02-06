package pl.mazurmarcin.javastart.zadania.programowanie_obiektowe_II;

public class Rectangle implements Drawable {

	private int a;
	private int b;

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

	public Rectangle(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public void draw() {

		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}