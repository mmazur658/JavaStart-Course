package pl.mazurmarcin.javastart.lecture3;

/**
 * Zajęcia 3 - zadanie 2
 */
public class PenDemo {

    public static void main(String[] args) {

        Pen pen1 = new Pen("Blue", 0.14, 1);
        System.out.println(pen1.toString());

        Pen pen2 = new Pen("Black", 0.21, 2);
        System.out.println(pen2.toString());

    }
}
