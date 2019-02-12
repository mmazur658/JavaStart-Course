package pl.mazurmarcin.javastart.lecture11.homework;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	private String pesel;

	public Person(String firstName, String lastName, int age, String pesel) {
		
		if(age < 0)
			throw new IncorrectAgeException("The age cannot be less then 0");
		
		if(firstName==null ||  firstName.length() < 3 )
			throw new NameUndefinedException("Incorrect first Name. The given name cannot be null or shorten then 3 letters");
				
		if(lastName==null || lastName.length() < 3)
			throw new NameUndefinedException("Incorrect last Name. The given name cannot be null or shorten then 3 letters");
			
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
		return firstName + " " + lastName + ", wiek: " + age + ", pesel: " + pesel;
	}

}
