package pl.mazurmarcin.javastart.basic.chapter8;

import pl.mazurmarcin.javastart.basic.chapter13.OneMoreCalculator;

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        OneMoreCalculator calc = new OneMoreCalculator();

        System.out.println("Podaj pierwszą liczbę");
        double firstNumber = scaner.nextDouble();

        System.out.println("Podaj symbol matematyczny: + - / * ");
        scaner.nextLine();
        String symbol  = scaner.nextLine();

        System.out.println("Podaj drugą liczbę");
        double secondNumber = scaner.nextDouble();

        System.out.println(calc.calculate(firstNumber, secondNumber, symbol));

    }

}
