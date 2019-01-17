package pl.mazurmarcin.javastart.basic;

public class DataType {

    public static void main(String[] args) {

        int age = 25;

        boolean isTrue = true;

        char firstInitial = 'J';
        char secondInitial = 'K';

        String firstSentencePartOne = "Cześć Jan, słyszałem, że masz ";
        String firstSentencePartTwo = " lat i uczysz się programowania, czy to prawda?";
        String secondSentence = "Czy Twoje inicjały to ";
        String thirdSentence = "Tak, ";

        System.out.println(firstSentencePartOne+age+firstSentencePartTwo);
        System.out.println(isTrue);
        System.out.println(secondSentence + firstInitial + " " + secondInitial);
        System.out.println(thirdSentence+isTrue);


    }
}
