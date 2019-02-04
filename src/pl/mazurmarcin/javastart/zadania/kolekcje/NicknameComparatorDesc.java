package pl.mazurmarcin.javastart.zadania.kolekcje;

import java.util.Comparator;

public class NicknameComparatorDesc implements Comparator<Player> {

	@Override
	public int compare(Player object1, Player object2) {
		return object2.getNickName().compareTo(object1.getNickName());
	}

}
