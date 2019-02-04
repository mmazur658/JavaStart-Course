package pl.mazurmarcin.javastart.zadania.programowanie_obiektowe_II;

public class Main {

	public static void main(String[] args) {
		Building building = new Building(2);
		BuildingController controller = new BuildingController(building);
		controller.controlLoop();
	}

}
