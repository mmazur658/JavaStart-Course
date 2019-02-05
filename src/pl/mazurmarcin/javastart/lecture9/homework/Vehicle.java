package pl.mazurmarcin.javastart.lecture9.homework;

public class Vehicle {

	private String name;
	private double tankCapacity;
	private double fuelConsumption;

	public Vehicle(String name, double tankCapacity, double fuelConsumption) {
		this.name = name;
		this.tankCapacity = tankCapacity;
		this.fuelConsumption = fuelConsumption;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTankCapacity() {
		return tankCapacity;
	}

	public void setTankCapacity(double tankCapacity) {
		this.tankCapacity = tankCapacity;
	}

	public double getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	@Override
	public String toString() {
		return "Nazwa: " + name + ", bak: " + tankCapacity + ", spalanie: " + fuelConsumption + "/100km";
	}

	public double getRange() {
		return tankCapacity / fuelConsumption;
	}

}
