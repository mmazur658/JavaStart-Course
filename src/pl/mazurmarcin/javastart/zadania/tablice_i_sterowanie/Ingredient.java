package pl.mazurmarcin.javastart.zadania.tablice_i_sterowanie;

public class Ingredient {

	private String name;
	private double quanitity;

	public Ingredient(String name, double quanitity) {
		this.name = name;
		this.quanitity = quanitity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getQuanitity() {
		return quanitity;
	}

	public void setQuanitity(double quanitity) {
		this.quanitity = quanitity;
	}

	@Override
	public String toString() {
		return name + "(" + quanitity + ")";
	}

}
