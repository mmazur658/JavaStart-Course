package pl.mazurmarcin.javastart.podstawy.daty_i_czas;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Stoper {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);	
		
		System.out.println("Naciśnij enter aby uruchomić stoper");
		scanner.nextLine();
		Instant startTime = Instant.now();
		
		
		System.out.println("Naciśnij ENTER aby zatrzymać stoper");
		scanner.nextLine();
		Instant stopTime = Instant.now();
		
		Duration duration =Duration.between(startTime, stopTime);
		
		System.out.println("Zmierozny czas to: "+duration.getSeconds()+" s");
		
		
		scanner.close();

	}

}
