package pl.mazurmarcin.javastart.lecture2;
public class Mix {
    public static void main(String[] args) {

        int number = 10;

        System.out.println(++number + "+" + number + "=" + (number + number));
        System.out.println(++number + number);
        System.out.println(number + number++);
        System.out.println(++number + number--);
        System.out.println(--number);
    }
}