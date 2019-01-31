package pl.mazurmarcin.javastart.podstawy.operacje_na_plikach;

import java.util.Scanner;

public class CompanyApp {

	public static void main(String[] args) {

		Company company = new Company();
		CompanyController companyController = new CompanyController();
		Scanner scanner = new Scanner(System.in);
		Employee employee;

		for (int i = 0; i < 3; i++) {
			System.out.println("Podaj imiê, nazwisko i wyp³atê pracownika: ");
			employee = new Employee(scanner.nextLine(), scanner.nextLine(), scanner.nextDouble());
			company.addEmployee(employee);
			scanner.nextLine();
		}
		
		System.out.println("Stara firma: ");
		company.printEmployees();
		companyController.writeDataToFile(company);
		
		Company newCompany = companyController.readDataFromFile();
		System.out.println("Nowa firma: ");
		newCompany.printEmployees();
		
		scanner.close();

	}

}
