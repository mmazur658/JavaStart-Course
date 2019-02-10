package pl.mazurmarcin.javastart.lecture10;

public class Motorbike extends Vehicle {

	private int speedLimit;

	public Motorbike(String name, int year, int speedLimit) {
		super(name, year);
		this.speedLimit = speedLimit;
	}

	public int getSpeedLimit() {
		return speedLimit;
	}

	public void setSpeedLimit(int speedLimit) {
		this.speedLimit = speedLimit;
	}
	
	@Override
	public String toString() {
		return super.toString() + " limit: " + speedLimit;
	}

}
