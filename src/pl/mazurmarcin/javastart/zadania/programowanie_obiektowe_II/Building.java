package pl.mazurmarcin.javastart.zadania.programowanie_obiektowe_II;

import java.util.Arrays;
import java.util.Random;

public class Building {

	private Room[] rooms;

	public Building(int numberOfRooms) {
		rooms = new Room[numberOfRooms];
		generateRooms();
	}

	private void generateRooms() {
		Random random = new Random();

		for (int i = 0; i < rooms.length; i++) {
			int currentTemperature = random.nextInt(20) + 15;
			int targetTemperature = currentTemperature - random.nextInt(10);
			int volume = 25 + random.nextInt(30);
			AirConditioner airConditioner = getRandomAirConditioner();
			rooms[i] = new Room(i+1, currentTemperature, targetTemperature, volume, airConditioner);
		}

	}

	private AirConditioner getRandomAirConditioner() {
		Random random = new Random();
		if (random.nextBoolean())
			return new BasicAirConditioner();
		else
			return new ProAirConditioner();
	}

	public boolean isBuldingCooled() {
		for (Room room : rooms) {
			if (room.getCurrentTemperature() > room.getTargetTemperature())
				return false;
		}
		return true;
	}
	
    public void coolRooms() {
        for (Room room : rooms) {
            room.cool();
        }
    }

	@Override
	public String toString() {
		return "Building [rooms=" + Arrays.toString(rooms) + "]";
	}
    
    


}
