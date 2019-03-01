package pl.mazurmarcin.javastart.lecture16;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class WorkScheduleApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

		System.out.println("Podaj datę i godzinę rozpoczęcia pracy w formacie yyyy-MM-dd HH:mm");
		LocalDateTime startDate = null;
		try {
			startDate = LocalDateTime.parse(scanner.nextLine(), dateFormat);
		} catch (DateTimeParseException exception) {
			System.err.println("Nieprawidłowy format daty.");
		}

		System.out.println("Ile godzin pracujesz?");
		long hours = scanner.nextInt();

		ZoneId zoneId = ZoneId.of("Europe/Warsaw");
		ZonedDateTime zonedDateTime = ZonedDateTime.of(startDate, zoneId);

		System.out.println("Godzina zakończenia pracy: " + zonedDateTime.plusHours(hours));

		ZoneId zoneSingapore = ZoneId.of("Asia/Singapore");
		ZoneId zoneHawaii = ZoneId.of("US/Hawaii");
		ZoneId zoneMontserrat = ZoneId.of("America/Montserrat");

		System.out.println("Godzina w Singapore: " + zonedDateTime.withZoneSameInstant(zoneSingapore));
		System.out.println("Godzina w Hawaii: " + zonedDateTime.withZoneSameInstant(zoneHawaii));
		System.out.println("Godzina w Montserrat: " + zonedDateTime.withZoneSameInstant(zoneMontserrat));

		scanner.close();
	}

}
