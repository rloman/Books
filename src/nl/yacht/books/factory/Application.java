package nl.yacht.books.factory;

import nl.yacht.books.model.Book;

public class Application {

    public static void main(String[] args) {
        Book b = BookFactory.getInstance("Libelle");

        System.out.println(b.getPages());

        Book a = BookFactory.getInstance("Other");
        Book c = BookFactory.getInstance("Other");

        System.out.println(Book.bookCounter);
    }
}
