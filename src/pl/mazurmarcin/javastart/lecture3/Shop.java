package pl.mazurmarcin.javastart.lecture3;

public class Shop {

    public static void main(String[] args) {

        Address address = new Address();
        address.city = "Poznań";
        address.street = "Jeżycka";
        address.postalCode = "61-622";
        address.number = "3B";

        Producer producer1 = new Producer();
        producer1.name = "Mlekowita";
        producer1.address = address;

        Product product1 = new Product();
        product1.name = "Mleko";
        product1.price = 3.2;
        product1.producer = producer1;

        Producer producer2 = new Producer();
        producer2.name = "Milka";

        Product product2 = new Product();
        product2.name = "Mleko";
        product2.price = 2.8;
        product2.producer = producer2;

        Product product3 = new Product("Czekolada", 2.99,
                new Producer("Wedel",
                        new Address("Wrocław", "Małostkowa", "52-389", "2-2")));

        System.out.println("product3: " + product3.name+", "+product3.price+", "+product3.producer.name+", "+product3.producer.address.city);


    }
}
