package pl.mazurmarcin.javastart.lecture5;

public class User {

	private String firstName;
	private String lastName;
	private String pesel;
	private int age;

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

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public User(String firstName, String lastName, String pesel, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.pesel = pesel;
		this.age = age;
	}

	public User() {

	}

	@Override
	public String toString() {
		return "User: Imi�: " + firstName + ", Nazwisko: " + lastName + ", Pesel: " + pesel + ", Wiek: " + age + ".";
	}

	
	
}
