package pl.mazurmarcin.javastart.lecture5;

public class MathQuizApp {

	public static void main(String[] args) {

		MathQuiz quiz = new MathQuiz();
		boolean[] results = new boolean[3];

		System.out.println("Odpowiedz na 3 pytania: ");
		results[0] = quiz.question1();
		results[1] = quiz.question2();
		results[2] = quiz.question3();

		int userResult = 0;
		String tempAnswer = "";

		for (int i = 0; i < results.length; i++) {

			tempAnswer = results[i] ? "Poprawnie" : "Niepoprawnie";
			System.out.println("Na pytanie nr: " + (i + 1) + " odpowiedzia³eœ " + tempAnswer);

			if (results[i])
				userResult++;
		}

		System.out.println("Twój wynik: " + userResult + "/3");

	}

}
