package pl.mazurmarcin.javastart.podstawy.operacje_na_plikach;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CompanyController {

	public static final String EMPLOYEES_FILE = "employees.info";

	public void writeDataToFile(Company company) {

		try (FileOutputStream fos = new FileOutputStream(EMPLOYEES_FILE);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {

			oos.writeObject(company);

		} catch (IOException exception) {
			System.err.println("B³ad zapisu. Dane nie zosta³ zapisane.");
			exception.printStackTrace();
		}

	}

	public Company readDataFromFile() {

		Company company;

		try (FileInputStream fis = new FileInputStream(EMPLOYEES_FILE);
				ObjectInputStream ois = new ObjectInputStream(fis);) {

			company = (Company) ois.readObject();

		} catch (IOException | ClassNotFoundException exception) {
			System.err.println("Plik nie zosta³ odnaleziony");
			exception.printStackTrace();
			company = null;
		}

		return company;

	}

}
