package pl.mazurmarcin.javastart.app;

public class Library {

    public static void main(String[] args) {

        final String appName = "Biblioteka v0.1";

        Book bookOne = new Book();
        bookOne.setAuthor("Henryk Sienkiewicz");
        bookOne.setIsbn("9788373271890");
        bookOne.setPages(296);
        bookOne.setPublisher("Greg");
        bookOne.setReleaseDate(2010);
        bookOne.setTitle("W pustyni i puszczy");

        Book bookTwo = new Book("Java. Efektywne programowanie. Wydanie II", "Joshua Bloch", 2009,
                352, "Helion", "9788324620845");

        Book bookThree = new Book("SCJP Sun Certified Programmer for Java 6 Study Guide",
                "Bert Bates, Katherine Sierra", 2008, 851, "McGraw-Hill Osborne Media",
                "9780071591065");

        System.out.println("* * * * * " + appName + " * * * * * \n");
        System.out.println("Książki dostępne w bibliotece: \n");
        System.out.println(bookOne.toString());
        System.out.println(bookTwo.toString());
        System.out.println(bookThree.toString());

    }
}
