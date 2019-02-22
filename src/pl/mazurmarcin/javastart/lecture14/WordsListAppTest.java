package pl.mazurmarcin.javastart.lecture14;

public class WordsListAppTest {

	public static void main(String[] args) {

		WordsListApp wordsListApp = new WordsListApp();
		wordsListApp.printList();

		wordsListApp.sortListWithNaturalOrder();
		wordsListApp.printList();

		wordsListApp.sortListWithReversedOrder();
		wordsListApp.printList();

		wordsListApp.printStatistics();

		wordsListApp.printMostPopularWord();

	}

}
