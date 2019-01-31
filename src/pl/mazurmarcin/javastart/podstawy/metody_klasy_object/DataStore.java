package pl.mazurmarcin.javastart.podstawy.metody_klasy_object;

public class DataStore {

	private static final int MAX_COMPUTERS = 100;
	private int numberOfComputers = 0;

	private Computer[] computers;

	public DataStore() {
		computers = new Computer[MAX_COMPUTERS];
	}

	public int getNumberOfComputers() {
		return numberOfComputers;
	}

	public void setNumberOfComputers(int numberOfComputers) {
		this.numberOfComputers = numberOfComputers;
	}

	public Computer[] getComputers() {

		Computer[] tempComputer = new Computer[numberOfComputers];

		for (int j = 0; j < tempComputer.length; j++) {
			tempComputer[j] = computers[j];
		}

		return tempComputer;
	}

	public void add(Computer computer) {

		if (numberOfComputers < 100 && computer != null) {
			computers[numberOfComputers] = computer;
			numberOfComputers++;
		}

	}

	public int checkAvailability(Computer computer) {

		if (computer == null)
			return 0;

		int counter = 0;

		for (int i = 0; i < numberOfComputers; i++) {
			if (computers[i].equals(computer))
				counter++;
		}

		return counter;

	}

}
