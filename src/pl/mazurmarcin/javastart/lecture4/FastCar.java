package pl.mazurmarcin.javastart.lecture4;

public class FastCar {

    String name;
    Engine engine;
    double currentSpeed;

    public FastCar() {

    }

    public FastCar(String name, Engine engine, double currentSpeed) {
        this.name = name;
        this.engine = engine;
        this.currentSpeed = currentSpeed;
    }

    public void show() {
        System.out.println("Car name: " + name + ", horsepower: "
                + engine.horsePower + ", Speed: " + currentSpeed);

    }

}
