package pl.mazurmarcin.javastart.lecture11.homework.task_11_3;

public class Processor extends ClockComponent {

	public Processor(String model, String producer, String serialNumber, int clockSpeed, int temperature,
			int maxTemperature) {
		super(model, producer, serialNumber, clockSpeed, temperature, maxTemperature, 10);

	}
	
}