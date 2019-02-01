package pl.mazurmarcin.javastart.podstawy.klasa_arrays;

public class PersonApp {

	public static void main(String[] args) {

		PersonDatabase personDatabase = new PersonDatabase();

		System.out.println("Iloœæ  elemntów: " + personDatabase.size());
		System.out.println("Rozmiar tablicy: " + personDatabase.getArrayLength());

		Person marcin = new Person("Marcin", "Mazur", "89632523523");
		personDatabase.add(marcin);

		System.out.println("Iloœæ  elemntów: " + personDatabase.size());
		System.out.println("Rozmiar tablicy: " + personDatabase.getArrayLength());

		Person michal = new Person("Micha³", "Zawada", "7852325632");
		personDatabase.add(michal);

		System.out.println("Iloœæ  elemntów: " + personDatabase.size());
		System.out.println("Rozmiar tablicy: " + personDatabase.getArrayLength());
		
		Person andzela = new Person("Andzelika", "Kalinowaska", "98563225625");		
		personDatabase.add(andzela);
		
		System.out.println("Iloœæ  elemntów: " + personDatabase.size());
		System.out.println("Rozmiar tablicy: " + personDatabase.getArrayLength());		
		
		System.out.println("Index 1: "+personDatabase.get(1));
		personDatabase.remove(michal);
		System.out.println("Index 1: "+personDatabase.get(1));
		

	}

}
