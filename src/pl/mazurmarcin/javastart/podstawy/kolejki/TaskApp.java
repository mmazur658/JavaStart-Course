package pl.mazurmarcin.javastart.podstawy.kolejki;

public class TaskApp {

	private static final int ADD = 1;
	private static final int TAKE = 2;
	private static final int EXIT = 3;

	private static void printOptions() {
		System.out.println();
		System.out.println(ADD + " - Dodaj nowe zadanie");
		System.out.println(TAKE + " - Pobierz kolejne zadanie");
		System.out.println(EXIT + " - Wyjście");
	}

	public static void main(String[] args) {

		TaskManager taskManager = new TaskManager();

		int userInput = 0;

		do {

			printOptions();
			userInput = taskManager.getUserInput();

			switch (userInput) {
			case ADD:
				taskManager.addNewTask();
				break;
			case TAKE:
				taskManager.takeNextTask();
				break;
			case EXIT:
				System.out.println("Do zobaczenia! ");
				break;
			default:
				System.out.println("Nieznana komenda");
			}

		} while (userInput != EXIT);

	}

}
