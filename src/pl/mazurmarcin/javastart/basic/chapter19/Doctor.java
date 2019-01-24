package pl.mazurmarcin.javastart.basic.chapter19;

public class Doctor extends Person {

	private double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public Doctor(String firstName, String lastName, double salary, double bonus) {
		super(firstName, lastName, salary);
		this.bonus = bonus;
	}

	public Doctor() {

	}

	@Override
	public String toString() {
		return super.toString()+", bonus: " + bonus;
	}

}
