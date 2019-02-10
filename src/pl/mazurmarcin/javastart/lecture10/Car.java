package pl.mazurmarcin.javastart.lecture10;

public class Car extends Vehicle {

	private int seatNumber;

	public Car(String name, int year, int seatNumber) {
		super(name, year);
		this.seatNumber = seatNumber;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	@Override
	public String toString() {
		return super.toString() + " miejsca: " + seatNumber;
	}

}
