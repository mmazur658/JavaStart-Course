package pl.mazurmarcin.javastart.lecture6;

import java.util.Scanner;

public class CompanyApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Podaj ilo�� pracownik�w: ");
		int numberOfEmployees = scanner.nextInt();

		Company company = new Company(numberOfEmployees);

		Employee tempEmployee;

		for (int i = 0; i < numberOfEmployees; i++) {

			scanner.nextLine();
			tempEmployee = new Employee();

			System.out.println("Podaj imi�: ");
			tempEmployee.setFirstName(scanner.nextLine());

			System.out.println("Podaj nazwisko: ");
			tempEmployee.setLastName(scanner.nextLine());

			System.out.println("Podaj wyngarodzenie: ");
			tempEmployee.setSalary(scanner.nextDouble());

			if (company.add(tempEmployee))
				System.out.println("\nPracownik zosta� dodany\n");
			else
				System.out.println("\nNie mo�na doda� wi�cej pracownik�w\n");

		}

		scanner.close();

		company.printEmployees();

		System.out.println("Totalne miesi�czne wyngarodzenie: " + company.totalSalary());

	}

}
