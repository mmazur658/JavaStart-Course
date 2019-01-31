package pl.mazurmarcin.javastart.podstawy.zmienne;

public class Variables {

    public static void main(String[] args) {

        String brand = "Jeep";
        String model = "Wragler";
        int year = 2002;
        double price = 6000.00;
        long mileage = 157000;

        System.out.println("First car: " + brand + " " + model + ", year: " + year + ", mileage: " + mileage + ", price: " + price + " USD.");

        brand = "BMW";
        model = "550";
        year = 2012;
        price = 12550.00;
        mileage = 60000;

        System.out.println("Second car: " + brand + " " + model + ", year: " + year + ", mileage: " + mileage + ", price: " + price + " USD.");
    }

}
