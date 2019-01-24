package pl.mazurmarcin.javastart.lecture5;

/**
 * zadanie-java-47
 * @author Marcin Mazur
 *
 */
public class LineController {
	
	public int calcLength(Line line1) {

		int start = line1.getFirstPoint().getX();
		int end = line1.getSecondPoint().getX();

		if ((start < 0 && end < 0) || (start >= 0 && end >= 0)) {

			if (Math.abs(start) > Math.abs(end))
				return Math.abs(start) - Math.abs(end);
			else
				return Math.abs(end) - Math.abs(start);

		} else
			return Math.abs(start) + Math.abs(end);

	}
	
	public void printLongerLine(Line line1,Line line2){
		
		int firstLength = calcLength(line1);
		int secondLength = calcLength(line2);
		
		System.out.println("D³ugoœæ pierwszej linii: " + firstLength);
		System.out.println("D³ugoœæ drugiej linil: " + secondLength);

		if (firstLength > secondLength) {
			
			System.out.println("Linia( " + line1.getFirstPoint().getX() + " , " + line1.getSecondPoint().getX()
					+ " ) jest d³u¿sza ni¿ linia( " + line2.getFirstPoint().getX() + " , "
					+ line2.getSecondPoint().getX() + " ).");
			
		} else if (firstLength < secondLength) {
			
			System.out.println("Linia( " + line2.getFirstPoint().getX() + " , " + line2.getSecondPoint().getX()
					+ " ) jest d³u¿sza ni¿ linia( " + line1.getFirstPoint().getX() + " , "
					+ line1.getSecondPoint().getX() + " ).");
			
		} else
			System.out.println("Linie s¹ równej d³ugoœci.");
	}
	

}
