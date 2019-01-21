package pl.mazurmarcin.javastart.basic.chapter9_10;

public class Point {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(){

    }

    void showMeThePoint(){
        System.out.println("X - "+getX()+", Y - "+getY());
    }
}
