package pl.mazurmarcin.javastart.podstawy.metody_klasy_object;

public class NotebookShop {

	public static void main(String[] args) {
		
		DataStore dataStore = new DataStore();
		dataStore.add(new Computer("Samsung", 12345));
		dataStore.add(new Computer("Samsung", 12345));
		dataStore.add(new Computer("Asus",15123));
		dataStore.add(new Computer("Toshiba", 55236));
		dataStore.add(new Computer("Airbook", 85695));

		Computer computer = new Computer("Samsung", 12345);
		
		int computersFound = dataStore.checkAvailability(computer);
		System.out.println("Znaleziono: "+computersFound);
		
		System.out.println("Wszystkie komputery: ");
		for(Computer comp : dataStore.getComputers())
			System.out.println(comp);


	}

}
