package pl.mazurmarcin.javastart.lecture11.homework.task_11_1;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	private String pesel;

	public Person(String firstName, String lastName, int age, String pesel) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAge(age);
		this.pesel = pesel;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {

		if (firstName == null || firstName.length() < 3)
			throw new NameUndefinedException(
					"Incorrect first Name. The given name cannot be null or shorten then 3 letters");

		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {

		if (lastName == null || lastName.length() < 3)
			throw new NameUndefinedException(
					"Incorrect last Name. The given name cannot be null or shorten then 3 letters");

		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {

		if (age < 0)
			throw new IncorrectAgeException("The age cannot be less then 0");

		this.age = age;
	}

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + ", wiek: " + age + ", pesel: " + pesel;
	}

}
