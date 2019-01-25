package pl.mazurmarcin.javastart.zadania.programowanie_obiektowe_I;

public class Employee {

	private String firstName;
	private String lastName;
	private double nettoSalary;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getNettoSalary() {
		return nettoSalary;
	}

	public void setNettoSalary(double nettoSalary) {
		this.nettoSalary = nettoSalary;
	}

	public Employee(String firstName, String lastName, double nettoSalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.nettoSalary = nettoSalary;
	}

	public Employee() {

	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", nettoSalary=" + nettoSalary + "]";
	}

}
