package pl.mazurmarcin.javastart.lecture10;

public class PersonApp {

	public static void main(String[] args) {

		Person[] people = new Person[3];

		people[0] = new Person("Marcin", "Mazur", "123456", 30);
		people[1] = new Person("Marcin", "Mazur", "123456", 30);
		people[2] = new Person("Michał", "Zawadzki", "5523252", 28);

		for (Person person : people)
			System.out.println(person);

		System.out.println("Równe obiekty: \n" + people[0] + "\n" + people[1] + "\n" + people[0].equals(people[1]));

		System.out.println("Nierówne obiekty: \n" + people[0] + "\n" + people[2] + "\n" + people[0].equals(people[2]));

	}

}
