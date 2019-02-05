package pl.mazurmarcin.javastart.lecture9;

public abstract class AirConditioner{

	private double targetTemperature;

	public double getTargetTemperature() {
		return targetTemperature;
	}

	public void setTargetTemperature(double targetTemperature) {
		this.targetTemperature = targetTemperature;
	}

	abstract void coolRoom(Room room);

}
