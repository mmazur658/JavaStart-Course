package pl.mazurmarcin.javastart.lecture3;

/**
 * Zajęcia 3 - zadanie 2
 */
public class Pen {

    String color;
    double size;
    int age;

    public Pen(){

    }

    public String getColor() {
        return color;
    }

    public double getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pen: " +
                "color = '" + color + '\'' +
                ", size = '" + size + '\'' +
                ", age = " + age +
                '.';
    }
}
