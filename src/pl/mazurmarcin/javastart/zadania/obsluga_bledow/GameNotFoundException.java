package pl.mazurmarcin.javastart.zadania.obsluga_bledow;

public class GameNotFoundException extends RuntimeException {

	public GameNotFoundException(String gameTitle) {
		super("Nie znalezniono gry: " + gameTitle);
	}
	
}
