package pl.mazurmarcin.javastart.lecture3;

/**
 * Zajęcia 3 - zadanie 52
 */
public class SimpleCalculator {

    boolean isEven(int number) {
        return (number % 2 == 0) ? true : false;
    }

    boolean isOdd(int number) {
        return (number % 2 == 0) ? false : true;
    }

    double circleField(double number) {
        return Math.PI * (number * number);
    }

    int power(int number) {
        return number * number;
    }

    public static void main(String[] args) {

        SimpleCalculator zadanie = new SimpleCalculator();
        System.out.println(zadanie.isEven(10)); // true
        System.out.println(zadanie.isEven(11)); // false
        System.out.println(zadanie.isOdd(10)); // false
        System.out.println(zadanie.isOdd(11)); // false
        System.out.println(zadanie.power(5));
        System.out.println(zadanie.circleField(5.2));


    }


}
