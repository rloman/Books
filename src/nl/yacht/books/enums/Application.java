package nl.yacht.books.enums;

public class Application {

    public static void main(String[] args) {

        Book b = new Book();
        b.setGenre(Genre.ROMANCE);

        if(Genre.DETECTIVE.equals(b.getGenre())) {

        }

    }
}
