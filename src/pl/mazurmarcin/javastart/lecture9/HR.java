package pl.mazurmarcin.javastart.lecture9;

public class HR {

	private static int getNumberOfEmployees(EmployeeNew[] employees, double limit) {

		int count = 0;

		for (EmployeeNew employeeNew : employees) {
			if (employeeNew.getSalary() > limit)
				count++;
		}

		return count;
	}

	private static double sumOfSalary(EmployeeNew[] employees) {

		double sum = 0;

		for (EmployeeNew employeeNew : employees)
			sum += employeeNew.getTotalPayment();

		return sum;
	}

	public static void main(String[] args) {

		EmployeeNew[] employees = new EmployeeNew[4];
		employees[0] = new EmployeeNew("Marcin", "Mazur", 5000);
		employees[1] = new DirectorNew("Michał", "Zawadzki", 8000, 2000);
		employees[2] = new EmployeeNew("Karolina", "Przybysz", 2500);
		employees[3] = new DirectorNew("Antoni", "Zapas", 12000, 3000);

		for (EmployeeNew employee : employees)
			employee.printInfo();

		double limit = 5200;

		HrAssistant.printNumberOfEmployees(limit, getNumberOfEmployees(employees, limit));

		HrAssistant.printSumOfSalaries(sumOfSalary(employees));
	}

}
