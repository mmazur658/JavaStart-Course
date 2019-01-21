package pl.mazurmarcin.javastart.basic.chapter9_10;

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
