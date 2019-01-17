package nl.yacht.books.mains;

import nl.yacht.books.model.Book;

public class Libelle extends Book  {

    public  Libelle() {
        super(33);
    }

    public void bar() {
       this.rating = 3.5;

       Book b = new Book(33);
//       b.rating = 3.5; // compile error
    }
}
