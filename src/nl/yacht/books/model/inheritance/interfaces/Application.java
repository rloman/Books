package nl.yacht.books.model.inheritance.interfaces;

public class Application {
    public static void main(String[] args) {
        Television tv = new Philips();

       tv.on();
    }
}
