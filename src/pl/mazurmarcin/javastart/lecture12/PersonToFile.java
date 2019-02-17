package pl.mazurmarcin.javastart.lecture12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersonToFile {

	private Person person;

	public PersonToFile(Person person) {
		this.person = person;
	}

	public void savePersonToFile(String fileName) {

		try {

			FileOutputStream fileOutputStream = new FileOutputStream(fileName);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

			objectOutputStream.writeObject(person);
			objectOutputStream.close();

		} catch (FileNotFoundException exception) {
			System.out.println("Plik nie został odnalzeiony");
		} catch (IOException exception) {
			System.out.println("Błąd zapisu danych");
		}

	}

}
