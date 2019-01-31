package pl.mazurmarcin.javastart.podstawy.metody_i_konstruktory;

public class Calculate {

    public static void main(String[] args) {

        double a = 5.7;
        double b = 2.2;

        Calculator calculator = new Calculator();

        System.out.println("Add: "+calculator.add(a,b));
        System.out.println("Subtract: "+calculator.subtract(a,b));
        System.out.println("Multiply: "+calculator.multiply(a,b));
        System.out.println("Divide: "+calculator.divide(a,b));
    }
}
