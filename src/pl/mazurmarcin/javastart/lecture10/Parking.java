package pl.mazurmarcin.javastart.lecture10;

public class Parking {

	public static void main(String[] args) {
		
		System.out.println("Auta na parkingu: ");
		Vehicle[] vehicles = { new Car("Audi", 2004, 4), new Motorbike("Yamaha", 2007, 250) };

		for (Vehicle vehicle : vehicles)
			System.out.println(vehicle);
		
		System.out.println("\nAuta w ruchu: ");

		vehicles[0].turnLeft();
		vehicles[1].goBack();

		for (Vehicle vehicle : vehicles)
			System.out.println(vehicle);

		
		System.out.println("\nAuta w wypożyczalni: ");
		RentableCar[] rentableCars = {new RentableCar("Audi", 1999, 5, null),new RentableCar("Merc", 2009, 5, null)};
		
		for (RentableCar rentableCar : rentableCars)
			System.out.println(rentableCar);
		
		
		System.out.println("\nAuto zostało wypożyczone: ");		
		rentableCars[0].rent("Marcin", "Mazur", "1");		
		for (RentableCar rentableCar : rentableCars)
			System.out.println(rentableCar);
		
		System.out.println("\nAuto zostało zwrócone: ");
		rentableCars[0].handOver();	
		for (RentableCar rentableCar : rentableCars)
			System.out.println(rentableCar);

	}

}
