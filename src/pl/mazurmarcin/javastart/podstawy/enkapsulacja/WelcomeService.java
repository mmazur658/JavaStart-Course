package pl.mazurmarcin.javastart.podstawy.enkapsulacja;

public class WelcomeService {

	public void sayHelloo(Client client) {

		String firstName = client.getFirstName();
		String lastName = client.getLastName();

		if (firstName != null && lastName != null)
			System.out.println("Witaj " + firstName + " " + lastName);

		else if (firstName == null && lastName != null)
			System.out.println("Witaj panie/pani " + lastName);
		
		else if (firstName != null && lastName == null)
			System.out.println("Witaj " + firstName);
		else 
			System.out.println("Witaj nieznajomy");
	}

}
