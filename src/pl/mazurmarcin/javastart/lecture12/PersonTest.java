package pl.mazurmarcin.javastart.lecture12;

public class PersonTest {

	private final static String FILE_NAME = "person.person";

	public static void main(String[] args) {

		Person person = new Person("Marcin", "Mazur", 30, "4523658");
		PersonToFile personToFile = new PersonToFile(person);
		System.out.println("Osoba początkowa: " + person);
		personToFile.savePersonToFile(FILE_NAME);

		PersonFromFile personFromFile = new PersonFromFile();

		Person newPerson = personFromFile.readPersonToFile(FILE_NAME);
		System.out.println("Osoba z pliku: " + newPerson);

	}

}
