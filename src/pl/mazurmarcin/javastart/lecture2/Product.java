package pl.mazurmarcin.javastart.lecture2;

public class Product {

    String name;
    Producer producer;
    double price;

    public Product(){

    }

    public Product(String name, Producer producer, double price){

        this.name=name;
        this.producer=producer;
        this.price=price;
    }
}
