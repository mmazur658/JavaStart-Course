package pl.mazurmarcin.javastart.zadania.programowanie_obiektowe_I;

public class CabrioApp {

	public static void main(String[] args) {
		
		CabrioController cabrioController = new CabrioController();
		
		Cabrio cabrio = new Cabrio("Ford", "Mustang", 0, true);
		
		cabrioController.printRoofStatus(cabrio);
		
		cabrioController.closeRoof(cabrio);
		
		cabrioController.printRoofStatus(cabrio);
		
		

	}

}
