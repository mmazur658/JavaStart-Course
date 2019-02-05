package pl.mazurmarcin.javastart.lecture9;

public class Director extends Employee {

	private double bonus;

	public Director() {

	}

	public Director(String firstName, String lastName, String address, String phoneNumbr, double salary, double bonus) {
		super(firstName, lastName, address, phoneNumbr, salary);
		this.bonus = bonus;
	}

	public Director(String firstName, String lastName, String address, String phoneNumbr, double salary) {
		super(firstName, lastName, address, phoneNumbr, salary);
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	private double totalPayment() {
		return getSalary() + bonus;
	}

	@Override
	public String toString() {
		return super.toString() + ", premia: " + bonus + ", Total payment: " + totalPayment();
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(", premia: " + bonus + ", Total payment: " + totalPayment());
	}

}
