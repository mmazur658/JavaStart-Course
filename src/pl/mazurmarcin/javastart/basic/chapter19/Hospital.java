package pl.mazurmarcin.javastart.basic.chapter19;

public class Hospital {

	private static final int MAX_EMPLOYEES = 10;;

	Person[] persons = new Person[MAX_EMPLOYEES];

	private int numberOfPersons = 0;

	public void addPerson(Person person) {
		if (numberOfPersons < persons.length) {
			persons[numberOfPersons] = person;
			numberOfPersons++;
		}
	}

	@Override
	public String toString() {

		String result = "";
		for (int i=0;i<numberOfPersons; i++) {
			result = result+persons[i]+"\n";
		}

		return result;

	}

}
