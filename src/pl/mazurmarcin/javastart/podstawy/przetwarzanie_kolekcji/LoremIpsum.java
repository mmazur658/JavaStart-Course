package pl.mazurmarcin.javastart.podstawy.przetwarzanie_kolekcji;

import java.util.List;
import java.util.stream.Collectors;

class LoremIpsum {

	private static void removeDotsAndCommas(List<String> wordsList) {

		wordsList = wordsList.stream().map(word -> word.replaceAll(",", "")).map(word -> word.replaceAll("\\.", ""))
				.collect(Collectors.toList());

	}

	private static long countSWords(List<String> wordsList) {

		return wordsList.stream().filter(word -> word.startsWith("s")).count();

	}

	private static long countFiveLettersWords(List<String> wordsList) {

		return wordsList.stream().filter(word -> word.length() == 5).count();

	}

	public static void main(String[] args) {

		LoremIpsumReader loremIpsumReader = new LoremIpsumReader();

		List<String> wordsList = loremIpsumReader.readWordsFromFile();

		removeDotsAndCommas(wordsList);
		
		System.out.println("Ilość słow na S: "+countSWords(wordsList));
		System.out.println("Ilość słów pięcio literowych: "+countFiveLettersWords(wordsList));

	}

}
