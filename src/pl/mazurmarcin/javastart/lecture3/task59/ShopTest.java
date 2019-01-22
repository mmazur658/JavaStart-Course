package pl.mazurmarcin.javastart.lecture3.task59;

public class ShopTest {

    public static void main(String[] args) {

        Category category1 = new Category("Sweets", "The best sweets ever");
        Category category2 = new Category("Dairy", "Healthy dairy products for balanced diet");

        Product product1 = new Product(category1,"Chocolate Bar", "Delicious chocolate bar",2.99 );
        Product product2 = new Product(category1,"Candy", "100% sugar",0.29 );
        Product product3 = new Product(category2,"Milk", "3.2% of fat",1.99 );
        Product product4 = new Product("Steel plate", "Some rusty steel", 55.20);

        SpecialOffer specialOffer = new SpecialOffer(product2,"Big sale due to incoming Christmas",
                "2018-12-15","2018-12-31", 0.2  );

        System.out.println(category1);
        System.out.println(category2);
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);       
        System.out.println(specialOffer);
  
        
        


    }
}
