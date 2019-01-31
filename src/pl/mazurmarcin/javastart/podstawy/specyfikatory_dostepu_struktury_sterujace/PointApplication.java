package pl.mazurmarcin.javastart.podstawy.specyfikatory_dostepu_struktury_sterujace;

public class PointApplication {

    private static final int ADD_X = 1;
    private static final int MINUS_X = 2;
    private static final int ADD_Y = 3;
    private static final int MINUS_Y = 4;

    public static void main(String[] args) {

        Point point = new Point(2, 5);

        PointController pointController = new PointController();

        point.showMeThePoint();

        int option = ADD_Y;

        switch (option){
            case ADD_X:
                pointController.addX(point);
                break;
            case MINUS_X:
                pointController.minusX(point);
                break;
            case ADD_Y:
                pointController.addY(point);
                break;
            case MINUS_Y:
                pointController.minusY(point);
                break;
            default:
                System.out.println("Incorrect value!");
        }

        point.showMeThePoint();



    }
}
