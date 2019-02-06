package pl.mazurmarcin.javastart.podstawy.przetwarzanie_kolekcji;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoremIpsumReader {

	private static final String FILE_NAME = "loremipsum.txt";

	public List<String> readWordsFromFile() {

		List<String> wordsList = new ArrayList<>();
		String tempString = null;

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_NAME))) {

			while ((tempString = bufferedReader.readLine()) != null) 
				wordsList.addAll(Arrays.asList(tempString.split(" ")));

		} catch (FileNotFoundException exception) {
			System.err.println("Plik nie został odnaleziony.");
			exception.printStackTrace();
		} catch (IOException exception) {
			System.err.println("Plik nie został odnaleziony.");
			exception.printStackTrace();
		}

		return wordsList;
	}

}
