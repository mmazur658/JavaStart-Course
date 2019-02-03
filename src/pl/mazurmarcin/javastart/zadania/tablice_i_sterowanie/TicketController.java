package pl.mazurmarcin.javastart.zadania.tablice_i_sterowanie;

import java.time.LocalDateTime;

public class TicketController {

	private static Passenger[] validateTickets(Passenger[] passengers) {

		int numberOfPassengersWithoutTicket = 0;

		for (Passenger passenger : passengers) {
			if (passenger.getTicket() == null || !passenger.getTicket().isValidd())
				numberOfPassengersWithoutTicket++;

		}

		Passenger[] passengersWithoutTicket = new Passenger[numberOfPassengersWithoutTicket];

		int index = 0;

		for (int i = 0; i < passengers.length; i++) {
			if (passengers[i].getTicket() == null || !passengers[i].getTicket().isValidd()) {
				passengersWithoutTicket[index] = passengers[i];
				index++;
			}
		}

		return passengersWithoutTicket;

	}

	public static void main(String[] args) {

		Passenger[] passengers = new Passenger[5];
		passengers[0] = new Passenger("Marcin", "Mazur");
		passengers[1] = new Passenger("Michał", "Zawadzki");
		passengers[2] = new Passenger("Anna", "Plebsara");
		passengers[3] = new Passenger("Antoni", "Nikt");
		passengers[4] = new Passenger("Anno", "Car");

		TicketMachine.buyTicket(passengers[0], 15);
		TicketMachine.buyTicket(passengers[1], 20);

		Ticket invalidTicket = new Ticket(LocalDateTime.now().minusMinutes(20), 15);
		passengers[2].setTicket(invalidTicket);

		Passenger[] passengersWithoutTicket = validateTickets(passengers);
		System.out.println("Pasażerowie bez biletu: ");
		for (Passenger passenger : passengersWithoutTicket) {
			System.out.println(passenger);
		}

	}

}
