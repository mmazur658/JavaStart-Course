package pl.mazurmarcin.javastart.basic.chapter16;

public class Apple extends Fruit {

    private String type;

    public Apple() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(": " + type);
    }
}
