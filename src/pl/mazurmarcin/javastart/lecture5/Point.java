package pl.mazurmarcin.javastart.lecture5;

/**
 * zadanie-java-47
 * @author Marcin Mazur
 *
 */
public class Point {
	
	private int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public Point(int x) {
		this.x = x;
	}
	
	public Point() {
		
	}

	@Override
	public String toString() {
		return x+"";
	}
	
	

}
