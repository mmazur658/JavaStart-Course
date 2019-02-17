package pl.mazurmarcin.javastart.lecture12;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 7279234474024827202L;

	private String firstName;
	private String lastName;
	private int age;
	private transient String pesel;

	public Person(String firstName, String lastName, int age, String pesel) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.pesel = pesel;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
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
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", pesel=" + pesel + "]";
	}

}
