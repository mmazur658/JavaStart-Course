package pl.mazurmarcin.javastart.lecture12;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class PersonFromFile {

	public Person readPersonToFile(String fileName) {

		try {

			FileInputStream fileInputStream = new FileInputStream(fileName);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

			Object readObject = objectInputStream.readObject();
			objectInputStream.close();

			return (Person) readObject;

		} catch (ClassNotFoundException exception) {
			System.out.println("Plik nie został odnalzeiony");
		} catch (IOException exception) {
			System.out.println("Błąd zapisu danych");
		}

		return null;

	}

}
