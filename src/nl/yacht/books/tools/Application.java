package nl.yacht.books.tools;

import nl.yacht.books.model.Book;

public class Application {

    public static void main(String[] args) {
        int max = BookMath.max(1, 2, 3, 5, 33, 44);

        System.out.println(max);

        System.out.println(BookMath.max(13, 1, 78));

        final Book b = new Book(99);
        b.setPages(100);

//        b = new Book(900); // vout
    }
}
