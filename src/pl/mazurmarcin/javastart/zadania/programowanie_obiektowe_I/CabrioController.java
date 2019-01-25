package pl.mazurmarcin.javastart.zadania.programowanie_obiektowe_I;

public class CabrioController {

	public void closeRoof(Cabrio cabrio) {

		if (cabrio.getCurrentSpeed() > 0) 

			System.out.println("Nie mo¿na zamkn¹æ dachu. Pojazd w ruchu. ");
			
		 else {
			System.out.println("Dach zosta³ zamkniêty.");
			cabrio.setRoofOpen(false);
	
		}

	}
	
	public void openRoof(Cabrio cabrio) {

		if (cabrio.getCurrentSpeed() > 0) 

			System.out.println("Nie mo¿na otworzyæ dachu. Pojazd w ruchu. ");
			
		 else {
			System.out.println("Dach zosta³ otwarty.");
			cabrio.setRoofOpen(true);
	
		}
	}
	
	public void printRoofStatus(Cabrio cabrio) {
		String roofStatus = cabrio.isRoofOpen() ? "otwarty" : "zamkniêty" ;
		System.out.println("Dach jest "+roofStatus);
	}

}
