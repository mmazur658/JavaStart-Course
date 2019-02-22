package pl.mazurmarcin.javastart.lecture14;

import java.util.LinkedList;
import java.util.Queue;

public class DoctorOffice {

	public static void main(String[] args) {

		Queue<Person> queue = new LinkedList<>();
		queue.offer(new Person("Jan", "Kowalski", "2523523563"));
		queue.offer(new Person("Michał", "Zawadzki", "7852325698"));
		queue.offer(new Person("Antoni", "Blue", "52321457"));

		while (!queue.isEmpty()) {
			System.out.println("Pacjent " + queue.peek()+" proszony do gabinetu.");
			System.out.println("Pacjent " + queue.poll()+" obsłużony.");
		}

	}

}
