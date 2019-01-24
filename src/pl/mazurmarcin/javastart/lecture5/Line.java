package pl.mazurmarcin.javastart.lecture5;

/**
 * zadanie-java-47
 * @author Marcin Mazur
 *
 */
public class Line {

	private Point firstPoint;
	private Point secondPoint;
	
	public Point getFirstPoint() {
		return firstPoint;
	}
	public void setFirstPoint(Point firstPoint) {
		this.firstPoint = firstPoint;
	}
	public Point getSecondPoint() {
		return secondPoint;
	}
	public void setSecondPoint(Point secondPoint) {
		this.secondPoint = secondPoint;
	}
	public Line(Point firstPoint, Point secondPoint) {
		this.firstPoint = firstPoint;
		this.secondPoint = secondPoint;
	}
	
	public Line() {
		
	}
	@Override
	public String toString() {
		return "Line: Pocz¹tek = " + firstPoint + ", Koniec = " + secondPoint + "";
	}
	
	
	
	

}
