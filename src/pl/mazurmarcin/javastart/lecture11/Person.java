package pl.mazurmarcin.javastart.lecture11;

public class Person {

	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName) {

		if (firstName == null || lastName == null)
			throw new NullPointerException("Imię i nazwisko nie może być puste lub null");

		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName;
	}

}
