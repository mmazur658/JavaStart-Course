package pl.mazurmarcin.javastart.lecture4;

import pl.mazurmarcin.javastart.lecture4.CarController;
import pl.mazurmarcin.javastart.lecture4.FastCar;

public class CarDemo {

    public static void main(String[] args) {

        FastCar fastCar = new FastCar("Dodage Durango", new Engine(286), 90);
        CarController carController = new CarController(fastCar);
        fastCar.show();

        carController.turbo();
        fastCar.show();

        carController.increaseSpeed(10);
        fastCar.show();

        carController.decreaseSpeed(20);
        fastCar.show();


    }
}
