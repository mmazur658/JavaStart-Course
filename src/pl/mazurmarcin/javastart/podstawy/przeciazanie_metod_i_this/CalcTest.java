package pl.mazurmarcin.javastart.podstawy.przeciazanie_metod_i_this;

import pl.mazurmarcin.javastart.podstawy.przeciazanie_metod_i_this.NewCalculator;

public class CalcTest {

    public static void main(String[] args) {

        NewCalculator newCalculator = new NewCalculator();

        int result = newCalculator.subtract(10,5);
        System.out.println(result);

        result = newCalculator.add(5,5,5);
        System.out.println(result);

        result = newCalculator.add(5,5,5,50);
        System.out.println(result);

    }
}
