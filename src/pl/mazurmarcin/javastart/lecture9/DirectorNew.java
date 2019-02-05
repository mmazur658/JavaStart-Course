package pl.mazurmarcin.javastart.lecture9;

public class DirectorNew extends EmployeeNew {

	private double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public DirectorNew(String firstName, String lastName, double salary, double bonus) {
		super(firstName, lastName, salary);
		this.bonus = bonus;
	}

	public DirectorNew() {

	}
	
	public double getTotalPayment() {
		return getSalary() + bonus;
	}


	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(", premia: " + bonus);
	}
	
	

}
