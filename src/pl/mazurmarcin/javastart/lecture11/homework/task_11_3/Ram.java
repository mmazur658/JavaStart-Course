package pl.mazurmarcin.javastart.lecture11.homework.task_11_3;

public class Ram extends ClockComponent {

	private int memory;

	public Ram(String model, String producer, String serialNumber, int clockSpeed, double temperature,
			double maxTemperature, int memory) {
		super(model, producer, serialNumber, clockSpeed, temperature, maxTemperature,15);
		this.memory = memory;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	@Override
	public String toString() {
		return super.toString()+", pamięć: "+memory+"GB";
	}
	
	

}
