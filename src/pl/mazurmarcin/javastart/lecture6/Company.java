package pl.mazurmarcin.javastart.lecture6;

public class Company {

	private Employee[] employees;

	private int numberOfEmployees = 0;

	public Company(int companySize) {
		employees = new Employee[companySize];
	}

	public boolean add(Employee employee) {

		if (numberOfEmployees < employees.length) {
			employees[numberOfEmployees] = employee;
			numberOfEmployees++;
			return true;
		} else
			return false;

	}

	public Employee getEmployee(int index) {
		
		return employees[index];
		
	}

	public double totalSalary() {

		double totalSalary = 0;

		for (int i = 0; i < numberOfEmployees; i++)
			totalSalary += employees[i].getSalary();

		return totalSalary;

	}

	public void printEmployees() {
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

}
