package pl.mazurmarcin.javastart.zadania.programowanie_obiektowe_II;

public class Room {

	private int number;
	private double currentTemperature;
	private double targetTemperature;
	private double volume;
	private AirConditioner airConditioner;

	public Room(int number, double currentTemperature, double targetTemperature, double volume,
			AirConditioner airConditioner) {
		this.number = number;
		this.currentTemperature = currentTemperature;
		this.targetTemperature = targetTemperature;
		this.volume = volume;
		this.airConditioner = airConditioner;
	}

	public void cool() {
		if (currentTemperature > targetTemperature)
			currentTemperature = airConditioner.lowerTemperature(currentTemperature, volume);
	}

	@Override
	public String toString() {
		return "Room [nr: " + number + ", temp: " + currentTemperature + ", targetTemp: " + targetTemperature
				+ ", vol: " + volume + ", airConditioner: " + airConditioner + "]";
	}

	public double getCurrentTemperature() {
		return currentTemperature;
	}

	public void setCurrentTemperature(double currentTemperature) {
		this.currentTemperature = currentTemperature;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getTargetTemperature() {
		return targetTemperature;
	}

	public void setTargetTemperature(double targetTemperature) {
		this.targetTemperature = targetTemperature;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public AirConditioner getAirConditioner() {
		return airConditioner;
	}

	public void setAirConditioner(AirConditioner airConditioner) {
		this.airConditioner = airConditioner;
	}

}
