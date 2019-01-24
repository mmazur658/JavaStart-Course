package pl.mazurmarcin.javastart.basic.chapter19;

public class HospitalApp {

	public static void main(String[] args) {

		Hospital hospital = new Hospital();
		
		Person doctor = new Doctor("Andrzej","Zawadzki", 15000, 5000);
		Person nurse1 = new Nurse("Anna", "Klek", 6000, 200);
		Person nurse2 = new Nurse("Michalina", "Dzik", 5500, 29);
		
		hospital.addPerson(doctor);
		hospital.addPerson(nurse1);
		hospital.addPerson(nurse2);
		
		
		System.out.println("Pracownicy: ");
		System.out.println(hospital);

	}

}
