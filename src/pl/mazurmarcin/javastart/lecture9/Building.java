package pl.mazurmarcin.javastart.lecture9;

public class Building {

	public static void main(String[] args) {

		AirConditioner basicAirConditioner = new BasicAirConditioner();
		basicAirConditioner.setTargetTemperature(20.2);
		AirConditioner proAirConditioner = new ProAirConditioner();
		proAirConditioner.setTargetTemperature(19.8);

		Room room101 = new Room(101, 50, 22.7);
		Room room102 = new Room(102, 60, 23.4);

		do {
			System.out.printf("Nr: %d, Temp: %.2f, Cel: %.2f \n", room101.getNumber(), room101.getCurrentTemperature(),
					basicAirConditioner.getTargetTemperature());

			System.out.printf("Nr: %d, Temp: %.2f, Cel: %.2f \n", room102.getNumber(), room102.getCurrentTemperature(),
					proAirConditioner.getTargetTemperature());

			basicAirConditioner.coolRoom(room101);
			proAirConditioner.coolRoom(room102);

		} while (room101.getCurrentTemperature() > basicAirConditioner.getTargetTemperature()
				&& room102.getCurrentTemperature() > proAirConditioner.getTargetTemperature());

		System.out.println("Wszystkie pokoje zostały schłodzone");

	}

}
