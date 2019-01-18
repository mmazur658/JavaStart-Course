package pl.mazurmarcin.javastart.lecture3;

public class Product {

    String name;
    double price;
    Producer producer;

    public Product(){

    }

    public Product(String name, double price, Producer producer) {
        this.name = name;
        this.price = price;
        this.producer = producer;
    }
}
