package pl.mazurmarcin.javastart.podstawy.przeciazanie_metod_i_this;

import java.util.Scanner;

public class SumNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ile liczb chcesz wprowadzić?");
        int numbers = scanner.nextInt();
        int sum = 0;

        while (numbers-- > 0) {
            sum += scanner.nextInt();
        }

        System.out.println("Suma podanych liczb to: " + sum);
        
        scanner.close();
    }

}
