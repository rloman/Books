package nl.yacht.books.model;

public class Book {

    private int pages;
    private double price;

    protected double rating;

    public static int bookCounter = 0;

    public static final double VATPERCENTAGE = 9.0;

    public Book(int pages){
        this.pages = pages;
        bookCounter++;
//        VATPERCENTAGE = 13.0; //vout
    }


    public void foo() {
        Book b = new Book(45);
//        this.pages = 101;

        Book a = new Book(99);
//        a.pages = 343;

//        b.pages = 45;
    }

    public int getPages() {
        int myAge = 0;

        System.out.println(myAge);

        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void finalize() {
        // callback

    }


}
