package pl.mazurmarcin.javastart.lecture11.homework;

public class Processor extends ClockComponent {

	private final int TEMPERATURE_MODIFIER = 10;

	public Processor(String model, String producer, String serialNumber, int clockSpeed, int temperature,
			int maxTemperature) {
		super(model, producer, serialNumber, clockSpeed, temperature, maxTemperature);

	}

	@Override
	public void increaseClockSpeed(int value) {

		double newTemp = getTemperature() + ((value / 100) * TEMPERATURE_MODIFIER);

		if (newTemp>getMaxTemperature())
			throw new ExtremeTemperatreException("Nie można zwiększyć, za wysoka temperatura!!");
		
		setTemperature(newTemp);
		setClockSpeed(getClockSpeed()+value);
		
	}
}