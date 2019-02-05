package pl.mazurmarcin.javastart.lecture9;

public class EmployeeNew extends Person {

	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public EmployeeNew(String firstName, String lastName, double salary) {
		super(firstName, lastName);
		this.salary = salary;
	}

	public EmployeeNew() {

	}
	
	public double getTotalPayment() {
		return salary;
	}

	@Override
	public void printInfo() {
		
		super.printInfo();
		System.out.print(", pensja: " + salary);
		
		if (!(this instanceof DirectorNew))
			System.out.println();
	}

}
