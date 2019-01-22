package pl.mazurmarcin.javastart.lecture5;

public class Drink {

	private String name;
	private double price;
	private boolean isAlcoholic;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isAlcoholic() {
		return isAlcoholic;
	}

	public void setIsAlcoholic(boolean isAlcoholic) {
		this.isAlcoholic = isAlcoholic;
	}

	public Drink() {

	}

	public Drink(String name, double price, boolean isAlcoholic) {
		this.name = name;
		this.price = price;
		this.isAlcoholic = isAlcoholic;
	}

}
