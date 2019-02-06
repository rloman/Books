package nl.yacht.books.model;

public class DonaldDuck extends Book {

    public DonaldDuck(int pages) {
        super(pages);
    }

    public void quack() {
        Book b = new Book(44);
        b.rating = 3.5;
    }
}
