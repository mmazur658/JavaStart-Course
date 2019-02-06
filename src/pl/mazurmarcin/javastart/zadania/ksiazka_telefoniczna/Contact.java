package pl.mazurmarcin.javastart.zadania.ksiazka_telefoniczna;

public class Contact implements Comparable<Contact> {

	private String name;
	private String phoneNumber;

	public Contact(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String toCSV() {
		return name+";"+phoneNumber;
	}

	@Override
	public String toString() {
		return name + " - " + phoneNumber;
	}

	@Override
	public int compareTo(Contact object) {
		return this.compareTo(object);
	}

}
