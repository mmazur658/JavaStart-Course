package pl.mazurmarcin.javastart.lecture4;

/**
 * zadanie-java-4
 */
public class TelevisionTest {

    public static void main(String[] args) {

        Television telly = new Television();
        telly.showStatus();

        telly.turnOn();
        telly.showStatus();

        telly.turnOff();
        telly.showStatus();
    }
}
