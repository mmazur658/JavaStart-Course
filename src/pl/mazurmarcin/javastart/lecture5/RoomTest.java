package pl.mazurmarcin.javastart.lecture5;

/**
 * zadanie-java-61
 * @author Marcin Mazur
 *
 */
public class RoomTest {

	public static void main(String[] args) {

		Room room = new Room();
		room.setTemperature(18); // MIN = 16
		room.setContainsAirConditioner(false);		
		System.out.println(room.decreaseTemperature()); // False
		
		
		room.setContainsAirConditioner(true);	
		System.out.println(room.decreaseTemperature()); // True
		System.out.println(room.decreaseTemperature()); // True
		System.out.println(room.decreaseTemperature()); // False
		System.out.println(room.decreaseTemperature()); // False
		
		
	}

}
