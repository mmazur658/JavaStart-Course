package pl.mazurmarcin.javastart.zadania.kolekcje;

import java.util.Comparator;

public class NicknameComparatorAsc implements Comparator<Player> {

	@Override
	public int compare(Player object1, Player object2) {
		return object1.getNickName().compareTo(object2.getNickName());
	}
	

}
