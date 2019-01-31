package pl.mazurmarcin.javastart.podstawy.operacje_na_plikach;

import java.io.Serializable;

public class Company implements Serializable{

	private static final long serialVersionUID = 8552103032008215022L;
	
	private static final int EMPLOYEE_LIMIT = 3;
	private int numberOfEmployee = 0;

	private Employee[] employees = new Employee[EMPLOYEE_LIMIT];

	public void addEmployee(Employee employee) {
		if (numberOfEmployee < employees.length) {
			employees[numberOfEmployee] = employee;
			numberOfEmployee++;
		} else {
			System.out.println("Nie mo¿na dodaæ wiêcej pracwoników");
		}
	}

	public void printEmployees() {

		if (numberOfEmployee == 0)
			System.out.println("Brak danych do wyœwietlenia");
		else {
			for (int i = 0; i < numberOfEmployee; i++)
				System.out.println(employees[i]);
		}

	}

}
