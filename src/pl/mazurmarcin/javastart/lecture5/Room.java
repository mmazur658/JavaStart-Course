package pl.mazurmarcin.javastart.lecture5;


/**
 * zadanie-java-61
 * @author Marcin Mazur
 *
 */
public class Room {

	private static final int MIN_TEMPERATURE = 16;

	private int area;
	private int temperature;
	private boolean containsAirConditioner;

	public Room() {

	}

	public Room(int area, int temperature, boolean containsAirConditioner) {
		this.area = area;
		this.temperature = temperature;
		this.containsAirConditioner = containsAirConditioner;
	}

	public boolean decreaseTemperature() {
		
		if (containsAirConditioner && temperature > MIN_TEMPERATURE) {
			temperature--;
			return true;
		} else
			return false;

	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public boolean isContainsAirConditioner() {
		return containsAirConditioner;
	}

	public void setContainsAirConditioner(boolean containsAirConditioner) {
		this.containsAirConditioner = containsAirConditioner;
	}

}
