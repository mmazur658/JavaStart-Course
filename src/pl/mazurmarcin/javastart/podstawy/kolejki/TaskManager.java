package pl.mazurmarcin.javastart.podstawy.kolejki;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskManager {



	private Scanner scanner = new Scanner(System.in);
	private Queue<Task> taskQueue = new PriorityQueue<>();

	public int getUserInput() {
		return scanner.nextInt();
	}

	public void takeNextTask() {

		if (taskQueue.isEmpty())
			System.out.println("Brak zadań do realizacji");
		else
			System.out.println("Twoje zadanie: " + taskQueue.poll().toString());

	}

	public void addNewTask() {

		scanner.nextLine();

		System.out.println("Podaj nazwę zadania: ");
		String taskName = scanner.nextLine();

		System.out.println("Podaj opis zadania: ");
		String taskDescription = scanner.nextLine();

		System.out.println("Podaj piorytet (HIGH, MODERATE, LOW)");
		Task.Priority priority = Task.Priority.valueOf(scanner.nextLine().toUpperCase());

		Task task = new Task(taskName, taskDescription, priority);
		taskQueue.add(task);

		System.out.println("Zadanie zostało dodane. ");

	}



	public void closeScanner() {
		scanner.close();
	}

}
