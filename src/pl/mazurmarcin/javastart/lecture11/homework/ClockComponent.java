package pl.mazurmarcin.javastart.lecture11.homework;

public abstract class ClockComponent extends Component {

	private int clockSpeed;
	private double temperature;
	private double maxTemperature;
	private final char DEGREE = 176;

	public ClockComponent(String model, String producer, String serialNumber, int clockSpeed, double temperature,
			double maxTemperature) {
		super(model, producer, serialNumber);
		this.clockSpeed = clockSpeed;
		this.temperature = temperature;
		this.maxTemperature = maxTemperature;
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

	public abstract void increaseClockSpeed(int value);

	@Override
	public String toString() {
		return super.toString() + ", Temp: " + temperature + DEGREE + "C, max-temp: " + maxTemperature + DEGREE
				+ "C, taktowanie: " + clockSpeed + "MHz";
	}

}
