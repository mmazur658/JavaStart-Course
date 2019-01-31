package pl.mazurmarcin.javastart.podstawy.specyfikatory_dostepu_struktury_sterujace;

public class PointController {

    void addX(Point point){
        point.setX(point.getX()+1);
    }

    void minusX(Point point){
        point.setX(point.getX()-1);
    }

    void addY(Point point){
        point.setY(point.getY()+1);
    }

    void minusY(Point point){
        point.setY(point.getY()-1);
    }


}
