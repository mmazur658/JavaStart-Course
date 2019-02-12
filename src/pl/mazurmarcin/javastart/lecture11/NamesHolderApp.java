package pl.mazurmarcin.javastart.lecture11;

public class NamesHolderApp {

	public static void main(String[] args) {

		NamesHolderController namesHolderController = new NamesHolderController(5);

		System.out.println("Dodawanie wartości null: ");
		namesHolderController.add(null);
		System.out.println("Rozmiar: " + namesHolderController.size());

		System.out.println("\nDodawanie prawidłowej unikatowej wartośći: Marcin");
		namesHolderController.add("Marcin");
		System.out.println("Rozmiar: " + namesHolderController.size());
		
		System.out.println("\nDodawanie duplikatu: Marcin");
		namesHolderController.add("Marcin");
		System.out.println("Rozmiar: " + namesHolderController.size());

		System.out.println("Przpełnienie tablicy: Dodanie Anna, Karol, Joanna, Aleksander, Łukasz");
		
		System.out.println("Dodawanie Anna ...");
		namesHolderController.add("Anna");
		System.out.println("Rozmiar: " + namesHolderController.size());
		
		System.out.println("Dodawanie Karol ...");
		namesHolderController.add("Karol");
		System.out.println("Rozmiar: " + namesHolderController.size());
		
		System.out.println("Dodawanie Joanna...");
		namesHolderController.add("Joanna");
		System.out.println("Rozmiar: " + namesHolderController.size());
		
		System.out.println("Dodawanie Aleksander...");
		namesHolderController.add("Aleksander");
		System.out.println("Rozmiar: " + namesHolderController.size());
		
		System.out.println("Dodawanie Łukasz...");
		namesHolderController.add("Łukasz");
		System.out.println("Rozmiar: " + namesHolderController.size());
		
		System.out.println("\nUsuwanie null ...");
		namesHolderController.remove(null);
		System.out.println("Rozmiar: " + namesHolderController.size());
		
		System.out.println("\nUsuwanie Marcin...");
		namesHolderController.remove("Marcin");
		System.out.println("Rozmiar: " + namesHolderController.size());
	}

}
