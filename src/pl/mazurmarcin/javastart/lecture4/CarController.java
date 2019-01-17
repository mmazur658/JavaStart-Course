package pl.mazurmarcin.javastart.lecture4;

public class CarController {

    FastCar fastCar;

    public CarController(FastCar fastCar) {
        this.fastCar = fastCar;
    }

    public void turbo() {
        fastCar.engine.horsePower = fastCar.engine.horsePower * 1.1;
    }

    public void increaseSpeed(int speed) {
        fastCar.currentSpeed = fastCar.currentSpeed + speed;
    }

    public void decreaseSpeed(int speed) {
        fastCar.currentSpeed = fastCar.currentSpeed - speed;
    }


}
