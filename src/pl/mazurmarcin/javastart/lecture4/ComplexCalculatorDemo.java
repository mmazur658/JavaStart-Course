package pl.mazurmarcin.javastart.lecture4;

public class ComplexCalculatorDemo {

    public static void main(String[] args) {

        ComplexCalculator complexCalculator = new ComplexCalculator();

        double resultD = complexCalculator.add(2.7, 5.9);
        String resultS = complexCalculator.add("Słoneczny", "Dzień");

        System.out.println("Double: " + resultD);
        System.out.println("String: " + resultS);

    }
}
