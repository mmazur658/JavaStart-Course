package pl.mazurmarcin.javastart.zadania.obsluga_bledow;

import java.util.HashMap;
import java.util.Map;

public class GameMachine {

	private Map<String, Game> games = new HashMap<>();

	public GameMachine() {
		fillMap();
	}

	private void fillMap() {
		
		games.put("GTA V", new Game("GTA V", 99));
		games.put("Legend of Zelda", new Game("Legend of Zelda", 129));
		games.put("Wiedźmin III", new Game("Wiedźmin III", 79));
		games.put("Heroes 3", new Game("Heroes 3", 39));
		
	}
	
	public Game sellGame(String gameTitle, double money) {
		
		if(!games.containsKey(gameTitle))
			throw new GameNotFoundException(gameTitle);
		
		Game game = games.get(gameTitle);
		
		if(money < game.getPrice())
			throw new NotEnoughMoneyException(game.getPrice(), money);
		
		return game;
	}

}
