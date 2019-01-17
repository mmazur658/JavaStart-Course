package pl.mazurmarcin.javastart.lecture3;

/**
 * Zajęcia 3 - zadanie 2
 */
public class PenDemo {

    public static void main(String[] args) {

        Pen pen1 = new Pen();
        pen1.setAge(1);
        pen1.setColor("Blue");
        pen1.setSize(0.14);

        System.out.println(pen1.toString());

        Pen pen2 = new Pen();
        pen2.setAge(2);
        pen2.setColor("Black");
        pen2.setSize(0.21);

        System.out.println(pen2.toString());

    }
}
