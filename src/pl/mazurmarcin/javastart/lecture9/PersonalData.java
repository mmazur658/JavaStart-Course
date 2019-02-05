package pl.mazurmarcin.javastart.lecture9;

public class PersonalData {

	private String firstName;
	private String lastName;
	private String address;
	private String phoneNumbr;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumbr() {
		return phoneNumbr;
	}

	public void setPhoneNumbr(String phoneNumbr) {
		this.phoneNumbr = phoneNumbr;
	}

	public PersonalData(String firstName, String lastName, String address, String phoneNumbr) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumbr = phoneNumbr;
	}

	public PersonalData() {

	}

	@Override
	public String toString() {
		return "Imię: " + firstName + ", nazwisko: " + lastName + ", adres: " + address + ", tel: " + phoneNumbr;
	}
	
	public void printInfo() {
		System.out.print("Imię: " + firstName + ", nazwisko: " + lastName + ", adres: " + address + ", tel: " + phoneNumbr);
	}
	

}
