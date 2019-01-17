package nl.yacht.books.factory;

import nl.yacht.books.mains.Libelle;
import nl.yacht.books.model.Book;

public class BookFactory {

    public static Book getInstance(String type) {
        if(type.equals("Libelle")) {
            return new Libelle();
        }
        else {
            if(type.equals("Other")){
                return new Book(33);
            }
            else {
                throw new IllegalArgumentException();
            }
        }
    }
}
