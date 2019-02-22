package pl.mazurmarcin.javastart.lecture14.homework.task14_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerStore {

	private static void printComputers(List<Computer> computers) {

		for (Computer computer : computers)
			System.out.println(computer);

	}

	public static void main(String[] args) {

		List<Computer> computers = new ArrayList<>();

		Computer computer1 = new Computer("Comp-A", 2500, 1024);
		Computer computer2 = new Computer("Comp-B", 3000, 3072);
		Computer computer3 = new Computer("Comp-B", 3000, 2048);
		Computer computer4 = new Computer("Comp-B", 2000, 4128);
		computers.add(computer1);
		computers.add(computer2);
		computers.add(computer3);
		computers.add(computer4);

		printComputers(computers);
		Collections.sort(computers);
		
		System.out.println("\n");
		printComputers(computers);

	}

}
