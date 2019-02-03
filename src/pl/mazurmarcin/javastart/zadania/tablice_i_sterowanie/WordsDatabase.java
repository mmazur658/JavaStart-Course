package pl.mazurmarcin.javastart.zadania.tablice_i_sterowanie;

import java.util.Random;

public class WordsDatabase {
	
	Random random = new Random();
	private final String[] words= {"Koty", "Kurs Java", "Kebab", "Anna", "Czołg"};
	
	public String getRandomWord() {		
		return words[random.nextInt(words.length)];	
		
	}

}
