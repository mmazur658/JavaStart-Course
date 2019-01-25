package pl.mazurmarcin.javastart.zadania.programowanie_obiektowe_I;

public class Cabrio {

	private String brand;
	
	private String model;
	
	private int currentSpeed;
	
	private boolean isRoofOpen;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public boolean isRoofOpen() {
		return isRoofOpen;
	}

	public void setRoofOpen(boolean isRoofOpen) {
		this.isRoofOpen = isRoofOpen;
	}

	public Cabrio(String brand, String model, int currentSpeed, boolean isRoofOpen) {
		this.brand = brand;
		this.model = model;
		this.currentSpeed = currentSpeed;
		this.isRoofOpen = isRoofOpen;
	}
	
	public Cabrio() {
		
	}

}
