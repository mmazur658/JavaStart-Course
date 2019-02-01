package pl.mazurmarcin.javastart.podstawy.klasa_arrays;

import java.util.Arrays;

public class PersonDatabase {

	private Person[] persons = new Person[1];
	
	public int getArrayLength() {
		return persons.length;
	}

	public void add(Person person) {

		Integer firstIndex;
		do {

			firstIndex = findFirstNull();

			if (firstIndex == null)
				persons = Arrays.copyOf(persons, persons.length * 2);
			else
				persons[firstIndex] = person;

		} while (firstIndex == null);

	}

	private Integer findFirstNull() {

		for (int i = 0; i < persons.length; i++) {
			if (persons[i] == null)
				return i;
		}
		return null;

	}

	public void remove(Person person) {

		Integer index = findPersonIndex(person);

		if (index == null) {
			System.out.println("Brak podanej osoby");
		} else {

			for (int i = index; i < persons.length - 1; i++) {
				if (persons[i] == null) {
					persons[i - 1] = null;
					break;
				} else
					persons[i] = persons[i + 1];

			}

		}

	}

	private Integer findPersonIndex(Person person) {

		for (int i = 0; i < persons.length; i++) {
			if (person.equals(persons[i]))
				return i;
		}

		return null;
	}

	public Person get(int index) {
		return persons[index];
	}

	public int size() {

		int count = 0;

		for (int i = 0; i < persons.length; i++) {
			if (persons[i] != null)
				count++;
		}

		return count;
	}

}
