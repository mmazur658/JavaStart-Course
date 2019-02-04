package pl.mazurmarcin.javastart.zadania.programowanie_obiektowe_II;

public class Tree implements Drawable {

	private int height;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Tree(int height) {
		this.height = height;
	}

	@Override
	public void draw() {
		for (int i = 0; i < height; i++) {

			for (int j = height - (1 + i); j > 0; j--)
				System.out.print(" ");

			for (int j = 0; j < (i * 2) + 1; j++)
				System.out.print("*");

			System.out.println();
		}
	}

}
