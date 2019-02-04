package pl.mazurmarcin.javastart.zadania.kolekcje;

import java.util.Arrays;
import java.util.Comparator;

public class PlayerSorting {

	public static void main(String[] args) {

		Player[] players = { new Player("Marcin", 200), new Player("Anna", 350), new Player("Michał", 190),
				new Player("Andrzej", 50) };
		
		System.out.println("Tablica bez sortownia: \n"+Arrays.toString(players));
		
		Arrays.sort(players);
		System.out.println("\nSortowanie domyślne: \n"+Arrays.toString(players));
		
		Arrays.sort(players, (player1,player2) -> Integer.compare(player1.getPoints(), player2.getPoints()));
		System.out.println("\nSortowanie rosnąco: \n"+Arrays.toString(players));
		
		Arrays.sort(players, Comparator.comparing(Player::getNickName));		
		System.out.println("\nSortowanie Alfabetycznie rosnąco: \n"+Arrays.toString(players));
		
		Arrays.sort(players, Comparator.comparing(Player::getNickName).reversed());
		System.out.println("\nSortowanie Alfabetycznie malejąco: \n"+Arrays.toString(players));
	}

}
