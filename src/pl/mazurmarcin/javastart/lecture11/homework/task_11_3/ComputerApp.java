package pl.mazurmarcin.javastart.lecture11.homework.task_11_3;

public class ComputerApp {

	public static void main(String[] args) {

		Hdd hdd = new Hdd("Barracuda 3.5''", "Seagate", "ST500DM002", 500);
		Ram ram = new Ram("DDR3 hyper", "Kingston", "KHX1600C9D3P1K2/8G", 1600, 40, 85, 16);
		Processor processor = new Processor("RYZEN 7", "AMD", "YD270XBGAFBOX", 3700, 40, 90);

		Computer computer = new Computer(ram, hdd, processor);

		System.out.println(computer.toString());

		computer.increaseProcessorClockSpeed(200);
		System.out.println(computer.toString());

		computer.increaseProcessorClockSpeed(300);
		System.out.println(computer.toString());

		computer.increaseProcessorClockSpeed(100);
		System.out.println(computer.toString());

	}

}
