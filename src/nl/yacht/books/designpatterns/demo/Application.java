package nl.yacht.books.designpatterns.demo;

import nl.yacht.books.designpatterns.Book;
import nl.yacht.books.designpatterns.BookFactory;
import nl.yacht.books.designpatterns.ComicBook;

public class Application {


    public static void main(String[] args) {
        Book b = BookFactory.getComicBook();

        if(b instanceof ComicBook) {
            System.out.println("That is a comic!");
        }
    }
}
