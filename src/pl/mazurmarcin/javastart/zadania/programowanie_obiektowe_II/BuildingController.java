package pl.mazurmarcin.javastart.zadania.programowanie_obiektowe_II;

public class BuildingController {
	
	private Building building;
	
    public BuildingController(Building building) {
        this.building = building;
    }
    
    public void controlLoop() {
        while(!building.isBuldingCooled()) {
            System.out.println(building);
            building.coolRooms();
            sleepOneSecond();
        }
        System.out.println("Pomieszczenia zostały schłodzone wg ustawień.");
    }

    private void sleepOneSecond() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException exception) {
        	exception.printStackTrace();
        }
    }

}
