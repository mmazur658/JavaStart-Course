package pl.mazurmarcin.javastart.lecture9;

public class ProAirConditioner extends AirConditioner {

	private static final int COOLING_EFFICIENCY = 2;

	@Override
	void coolRoom(Room room) {

		if (isCoolingNeeded(room.getCurrentTemperature(), getTargetTemperature()))
			room.setCurrentTemperature(room.getCurrentTemperature() - (COOLING_EFFICIENCY / room.getVolume()));

	}

	private boolean isCoolingNeeded(double currentTempetature, double targetTemperature) {
		return currentTempetature > targetTemperature;
	}

}
