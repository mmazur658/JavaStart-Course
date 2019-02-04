package pl.mazurmarcin.javastart.zadania.programowanie_obiektowe_II;

public class BasicAirConditioner implements AirConditioner{
	
	private static final int COOLING_EFFICIENCY = 1;

	@Override
	public double lowerTemperature(double temperature, double volume) {
		return temperature - (COOLING_EFFICIENCY / volume);
	}

	@Override
	public String toString() {
		return "Basic";
	}
	
	

}
