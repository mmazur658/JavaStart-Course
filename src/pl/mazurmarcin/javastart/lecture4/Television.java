package pl.mazurmarcin.javastart.lecture4;

/**
 * zadanie-java-4
 */
public class Television {

    private boolean isTurnOn;

    public Television() {
        isTurnOn = false;
    }

    public void turnOn() {
        isTurnOn = true;
    }

    public void turnOff() {
        isTurnOn = false;
    }

    public void showStatus(){
        String tellyStatus = isTurnOn ? "ON" : "OFF";
        System.out.println("Telly status: "+tellyStatus);
    }
}
