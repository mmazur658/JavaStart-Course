package pl.mazurmarcin.javastart.zadania.programowanie_obiektowe_I;

public class Ingredient {

	private String name;
	private double capacity;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public Ingredient() {

	}

	public Ingredient(String name, double capacity) {
		this.name = name;
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "nazwa: "+name + ", poj: " + capacity;
	}
	
	

}
