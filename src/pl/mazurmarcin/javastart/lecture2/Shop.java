package pl.mazurmarcin.javastart.lecture2;

public class Shop {

    public static void main(String[] args) {

        Product product1 = new Product("Twaróg", new Producer("Mlekovita", "Wysokie Mazowieckie"),
                12.59);

        System.out.println("Product 1: " + product1.name + " " + product1.producer.name + " from "
                + product1.producer.location + " price: " + product1.price);


        Product product2 = new Product();

        product2.name = "Ser";
        product2.producer = new Producer();
        product2.producer.name = "Spółdzielnia Mleczarska Gostyń";
        product2.producer.location = "Gostyń";
        product2.price = 8.22;

        System.out.println("Product 2: " + product2.name + " " + product2.producer.name + " from "
                + product2.producer.location + " price: " + product2.price);


    }
}
