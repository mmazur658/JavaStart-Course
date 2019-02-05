package pl.mazurmarcin.javastart.lecture9.homework;

public class Truck extends Car {

	private static final double AIR_CONDITIONER_FUEL_COST = 1.6;
	private static final double ADDITIONAL_WEIGHT_FUEL_COST = 0.5;
	private double cargoWeight;

	public Truck(String name, double tankCapacity, double fuelConsumption, boolean isAirConditionerOn,
			double cargoWeight) {
		super(name, tankCapacity, fuelConsumption, isAirConditionerOn);
		this.cargoWeight = cargoWeight;
	}

	public double getCargoWeight() {
		return cargoWeight;
	}

	public void setCargoWeight(double cargoWeight) {
		this.cargoWeight = cargoWeight;
	}

	public double getRange() {

		double actualFuelConsumption = isAirConditioner()
				? (getFuelConsumption() + (cargoWeight / 100 * ADDITIONAL_WEIGHT_FUEL_COST) + AIR_CONDITIONER_FUEL_COST)
				: getFuelConsumption() + (cargoWeight / 100 * ADDITIONAL_WEIGHT_FUEL_COST);

		return (getTankCapacity() / actualFuelConsumption) * 100;
	}

	@Override
	public String toString() {
		return super.toString() + ", waga ładunku: " + cargoWeight + " kg";
	}

}
