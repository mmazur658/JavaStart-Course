package pl.mazurmarcin.javastart.lecture11.homework.task_11_3;

public abstract class ClockComponent extends Component {

	private int clockSpeed;
	private double temperature;
	private double maxTemperature;
	private final char DEGREE_SYMBOL = 176;

	private final int TEMPERATURE_MODIFIER;

	public ClockComponent(String model, String producer, String serialNumber, int clockSpeed, double temperature,
			double maxTemperature, int temperatureModifier) {
		super(model, producer, serialNumber);
		this.clockSpeed = clockSpeed;
		this.temperature = temperature;
		this.maxTemperature = maxTemperature;
		this.TEMPERATURE_MODIFIER = temperatureModifier;
	}

	public int getClockSpeed() {
		return clockSpeed;
	}

	public void setClockSpeed(int clockSpeed) {
		this.clockSpeed = clockSpeed;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getMaxTemperature() {
		return maxTemperature;
	}

	public void setMaxTemperature(double maxTemperature) {
		this.maxTemperature = maxTemperature;
	}

	public int getTemperatureModifier() {
		return TEMPERATURE_MODIFIER;
	}

	public void increaseClockSpeed(int value) {

		double newTemp = getTemperature() + ((value / 100) * TEMPERATURE_MODIFIER);

		if (newTemp > getMaxTemperature())
			throw new ExtremeTemperatreException("Nie można zwiększyć, za wysoka temperatura!!");

		setTemperature(newTemp);
		setClockSpeed(getClockSpeed() + value);
	}

	@Override
	public String toString() {
		return super.toString() + ", Temp: " + temperature + DEGREE_SYMBOL + "C, max-temp: " + maxTemperature + DEGREE_SYMBOL
				+ "C, taktowanie: " + clockSpeed + "MHz";
	}

}
