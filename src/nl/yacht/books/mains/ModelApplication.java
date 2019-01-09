package nl.yacht.books.mains;

import nl.yacht.books.model.Book;

public class ModelApplication {

    public static void main(String[] args) {
        Book b = new Book(42);

        System.out.println(b.getPages());

        b.setPages(45);

        System.out.println(b.getPages());

        Book c = new Book(42);

        System.out.println(b.getPages());
        System.out.println(c.getPages());
    }
}
