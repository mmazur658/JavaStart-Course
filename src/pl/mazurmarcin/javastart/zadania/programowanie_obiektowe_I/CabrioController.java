package pl.mazurmarcin.javastart.zadania.programowanie_obiektowe_I;

public class CabrioController {

	public void closeRoof(Cabrio cabrio) {

		if (cabrio.getCurrentSpeed() > 0) 

			System.out.println("Nie mo�na zamkn�� dachu. Pojazd w ruchu. ");
			
		 else {
			System.out.println("Dach zosta� zamkni�ty.");
			cabrio.setRoofOpen(false);
	
		}

	}
	
	public void openRoof(Cabrio cabrio) {

		if (cabrio.getCurrentSpeed() > 0) 

			System.out.println("Nie mo�na otworzy� dachu. Pojazd w ruchu. ");
			
		 else {
			System.out.println("Dach zosta� otwarty.");
			cabrio.setRoofOpen(true);
	
		}
	}
	
	public void printRoofStatus(Cabrio cabrio) {
		String roofStatus = cabrio.isRoofOpen() ? "otwarty" : "zamkni�ty" ;
		System.out.println("Dach jest "+roofStatus);
	}

}
