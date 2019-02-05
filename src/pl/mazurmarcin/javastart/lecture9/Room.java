package pl.mazurmarcin.javastart.lecture9;

public class Room {

	private int number;
	private double volume;
	private double currentTemperature;

	public Room(int number, double volume, double currentTemperature) {
		this.number = number;
		this.volume = volume;
		this.currentTemperature = currentTemperature;

	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getCurrentTemperature() {
		return currentTemperature;
	}

	public void setCurrentTemperature(double currentTemperature) {
		this.currentTemperature = currentTemperature;
	}

	@Override
	public String toString() {
		return "Numer: " + number + ", obj:" + volume + ", temp: " + currentTemperature;
	}

}
