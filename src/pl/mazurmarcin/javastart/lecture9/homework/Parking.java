package pl.mazurmarcin.javastart.lecture9.homework;

public class Parking {

	public static void main(String[] args) {

		Car[] cars = new Car[4];
		cars[0] = new Car("Audi", 66, 8.2, false);
		cars[1] = new Car("Polonez", 55, 7.2, false);
		cars[2] = new Truck("Man", 520, 33.9, false, 3500);
		cars[3] = new Truck("Scania", 380, 27.2, false, 1200);

		for (Car car : cars)
			System.out.printf(car + ", Zasięg: %.2f km. \n", car.getRange());

		System.out.println("\nAir conditioner OFF --> ON \n");
		
		for (Car car : cars) {
			car.turnAirConditionerOn();
			System.out.printf(car + ", Zasięg: %.2f km. \n", car.getRange());
		}
	}

}
