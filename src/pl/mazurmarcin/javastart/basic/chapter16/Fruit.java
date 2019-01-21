package pl.mazurmarcin.javastart.basic.chapter16;

public class Fruit {

    private String category;

    public Fruit(){

    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public void printInfo(){
        System.out.print(category);
    }
}
