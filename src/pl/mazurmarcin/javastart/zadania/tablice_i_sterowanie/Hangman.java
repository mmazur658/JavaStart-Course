package pl.mazurmarcin.javastart.zadania.tablice_i_sterowanie;

public class Hangman {

	private String word;
	private char[] hiddenWord;
	private static final int MISTAKES_LIMIT = 5;
	private int userMistakes = 0;

	public Hangman(String word) {
		this.word = word;
		hiddenWord = new char[word.length()];
		fillArrayWithStarts();
	}

	private void fillArrayWithStarts() {

		for (int i = 0; i < hiddenWord.length; i++)
			hiddenWord[i] = '*';

	}

	public boolean containsGivenLetter(char letter) {

		boolean containsGivenLetter = false;

		for (int i = 0; i < hiddenWord.length; i++) {
			if (Character.toLowerCase(word.charAt(i)) == letter) {
				hiddenWord[i] = letter;
				containsGivenLetter = true;
			}

		}
		if (!containsGivenLetter)
			userMistakes++;

		return containsGivenLetter;
	}

	public void printWord() {
		for (char c : hiddenWord)
			System.out.print(c);

		System.out.println();
	}

	public boolean isUserWin() {

		for (char c : hiddenWord) {
			if (c == '*')
				return false;
		}

		return true;

	}
	
	public int getNumberOfMistakes() {
		return (MISTAKES_LIMIT-userMistakes);
	}
	
	public boolean isAbleToContinueGame() {
		return (userMistakes<MISTAKES_LIMIT);
	}

}
