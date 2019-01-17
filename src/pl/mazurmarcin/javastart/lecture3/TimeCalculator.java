package pl.mazurmarcin.javastart.lecture3;

public class TimeCalculator {

    int parseDaysToHours(int days) {

        return days * 24;

    }

    int parseGivenValuesToSeconds(int days, int hours, int minutes, int seconds) {

        return (days * 24 * 60 * 60) + (hours * 60 * 60) + (minutes * 60) + seconds;

    }

    double parseSecondsToMinutes(int seconds){

        return seconds/60;

    }

    public static void main(String[] args) {

        TimeCalculator timeCalculator = new TimeCalculator();

        System.out.println(timeCalculator.parseDaysToHours(2));
        System.out.println(timeCalculator.parseGivenValuesToSeconds(1,10,10,1));
        System.out.println(timeCalculator.parseSecondsToMinutes(360));


    }
}
