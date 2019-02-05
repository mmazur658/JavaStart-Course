package pl.mazurmarcin.javastart.lecture9.homework;

public class Car extends Vehicle {

	private static final double AIR_CONDITIONER_FUEL_COST = 0.8;

	private boolean airConditioner;

	public Car(String name, double tankCapacity, double fuelConsumption, boolean airConditioner) {
		super(name, tankCapacity, fuelConsumption);
		this.airConditioner = airConditioner;
	}

	public boolean isAirConditioner() {
		return airConditioner;
	}

	public void setAirConditioner(boolean airConditioner) {
		this.airConditioner = airConditioner;
	}

	public double getRange() {

		double actualFuelConsumption = airConditioner ? (getFuelConsumption() + AIR_CONDITIONER_FUEL_COST)
				: getFuelConsumption();

		return (getTankCapacity() / actualFuelConsumption) *100;
	}

	@Override
	public String toString() {
		return super.toString() + ", klimatyzacja: " + (airConditioner ? "Włączona " : "Wyłączona");
	}
	
	public void turnAirConditionerOn() {
		airConditioner =true;
	}
	
	public void turnAirConditionerOff() {
		airConditioner =false;
	}

}
