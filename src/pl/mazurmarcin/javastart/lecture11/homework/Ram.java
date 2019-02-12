package pl.mazurmarcin.javastart.lecture11.homework;

public class Ram extends ClockComponent {

	private int memory;
	private final int TEMPERATURE_MODIFIER = 15;

	public Ram(String model, String producer, String serialNumber, int clockSpeed, double temperature,
			double maxTemperature, int memory) {
		super(model, producer, serialNumber, clockSpeed, temperature, maxTemperature);
		this.memory = memory;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	@Override
	public void increaseClockSpeed(int value) {

		double newTemp = getTemperature() + ((value / 100) * TEMPERATURE_MODIFIER);

		if (newTemp>getMaxTemperature())
			throw new ExtremeTemperatreException("Nie można zwiększyć, za wysoka temperatura!!");
		
		setTemperature(newTemp);
		setClockSpeed(getClockSpeed()+value);
		
	}

	@Override
	public String toString() {
		return super.toString()+", pamięć: "+memory+"GB";
	}
	
	

}
