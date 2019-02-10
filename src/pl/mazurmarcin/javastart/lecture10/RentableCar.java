package pl.mazurmarcin.javastart.lecture10;

public class RentableCar extends Car implements Rentable {

	private PersonNew person;

	public RentableCar(String name, int year, int seatNumber, PersonNew person) {
		super(name, year, seatNumber);
		this.person = person;
	}

	public PersonNew getPerson() {
		return person;
	}

	public void setPerson(PersonNew person) {
		this.person = person;
	}

	@Override
	public boolean isRent() {
		return person == null;
	}

	@Override
	public void rent(String firstName, String lastName, String id) {
		person = new PersonNew(firstName, lastName, id);
	}

	@Override
	public void handOver() {
		person = null;
	}

	@Override
	public String toString() {
		return super.toString()+" wolny: "+isRent();
	}
	
	

}
