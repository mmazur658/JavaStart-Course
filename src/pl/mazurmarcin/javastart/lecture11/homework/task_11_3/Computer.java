package pl.mazurmarcin.javastart.lecture11.homework.task_11_3;

public class Computer {

	private Ram ram;
	private Hdd hdd;
	private Processor processor;

	public Computer(Ram ram, Hdd hdd, Processor processor) {
		this.ram = ram;
		this.hdd = hdd;
		this.processor = processor;
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}

	public Hdd getHdd() {
		return hdd;
	}

	public void setHdd(Hdd hdd) {
		this.hdd = hdd;
	}

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public void increaseRamClockSpeed(int value) {

		try {
			ram.increaseClockSpeed(value);
		} catch (ExtremeTemperatreException exception) {
			System.err.println(exception.getMessage());
		}

	}

	public void increaseProcessorClockSpeed(int value) {

		try {
			processor.increaseClockSpeed(value);
		} catch (ExtremeTemperatreException exception) {
			System.err.println(exception.getMessage());
		}

	}

	@Override
	public String toString() {
		return "Komputer: \nHdd: " + hdd + "\nRam: " + ram + "\nProcesor: " + processor;

	}

}
