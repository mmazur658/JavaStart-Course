package pl.mazurmarcin.javastart.lecture4.app;

import pl.mazurmarcin.javastart.lecture4.model.Book;

public class Library {

    public static void main(String[] args) {

        Book book = new Book();
        book.setAuthor("Jo Nesbo");
        book.setIsbn("8985632521452");
        book.setTitle("Czerwone Gardło");

        System.out.println(book.toString());
    }


}
