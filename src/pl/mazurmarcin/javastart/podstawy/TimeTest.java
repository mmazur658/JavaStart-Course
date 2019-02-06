package pl.mazurmarcin.javastart.podstawy;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeTest {

	public static void main(String[] args) {

		Instant startTime = Instant.now();

		for (int i = 0; i < 100; i++) 
			System.out.print("Czas ucieka! ");	

		Instant endTime = Instant.now();

		Duration duration = Duration.between(startTime, endTime);
		System.out.println("\nPętla trwała: " + duration.getNano() + " ns");

		System.out.println("\n");
		
		LocalTime timeNow = LocalTime.now();
		System.out.println("Obecny czas: " + timeNow);
		System.out.println("Czas na 10 min: " + timeNow.plusMinutes(10));
		
		System.out.println("\n");

		LocalDate dateNow = LocalDate.now();
		System.out.println("Obecna data: " + dateNow);
		System.out.println("Data za tydzień: "+dateNow.plusWeeks(1));
		System.out.println("Obecny rok: "+dateNow.getYear());
		
		System.out.println("\n");
		
		LocalDateTime timeDateNow = LocalDateTime.now();
		System.out.println("data: "+timeDateNow);
		System.out.println("Miesiąc: "+timeDateNow.getMonth());
		System.out.println("Minuta: "+timeDateNow.getMinute());
		

	}

}
