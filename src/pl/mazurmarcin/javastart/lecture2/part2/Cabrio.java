package pl.mazurmarcin.javastart.lecture2.part2;

/**
 * Programowanie obiektowe - cabrio
 */
public class Cabrio {

    String name;
    String model;
    boolean isRoofOpen;
    int speed;

    void closeRoof(int speed) {
        if (speed > 0 )
            System.out.println("You can`t close the roof during ride.");
        else
            System.out.println("The roof is closing");
    }

    void openRoof(int speed) {
        if (speed > 0 )
            System.out.println("You can`t open the roof during ride.");
        else
            System.out.println("The roof is opening");;
    }

    public static void main(String[] args) {

        Cabrio cabrio = new Cabrio();
        cabrio.isRoofOpen = true;
        cabrio.model = "S500";
        cabrio.name = "Tesla";

        cabrio.speed = 10;
        cabrio.openRoof(cabrio.speed);

        cabrio.speed = 0;
        cabrio.openRoof(cabrio.speed);


    }
}
