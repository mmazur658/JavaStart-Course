package pl.mazurmarcin.javastart.lecture9;

public class Employee extends PersonalData {

	private double salary;

	public Employee(String firstName, String lastName, String address, String phoneNumbr, double salary) {
		super(firstName, lastName, address, phoneNumbr);
		this.salary = salary;
	}

	public Employee() {

	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + " wynagrodzenie: " + salary;
	}
	
	@Override
	public void printInfo() {		
		super.printInfo();
		System.out.print(", wynagrodzenie: " + salary);
	}

}
