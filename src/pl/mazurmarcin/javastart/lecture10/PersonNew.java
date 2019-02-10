package pl.mazurmarcin.javastart.lecture10;

public class PersonNew {

	private String firstName;
	private String lastName;
	private String id;

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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public PersonNew(String firstName, String lastName, String id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + " " + id;
	}

}
