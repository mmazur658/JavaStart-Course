package pl.mazurmarcin.javastart.lecture8;

public class CarFactoryTest {

	public static void main(String[] args) {
		
		Car car1 = CarFactory.createCar();
		Car car2 = CarFactory.createCar();
		
		System.out.println(car1);
		System.out.println(car2);
		
		System.out.println("Razem samochodów: "+Car.getCarsNumber());

	}

}
