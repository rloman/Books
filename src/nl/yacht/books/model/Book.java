package nl.yacht.books.model;

public class Book {

	public static int bookCounter = 0;

    public static final double VATPERCENTAGE = 9.0;


    private int pages;
    private double price;
    private String title;
    protected double rating;

    
    public Book(int pages){
        this.pages = pages;
        bookCounter++;
//        VATPERCENTAGE = 13.0; //error since VATPERCENTAGE is final
    }

 public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public void foo() {
        Book b = new Book(45);
        this.pages = 101; // would be error if pages was final

        Book a = new Book(99);
        a.pages = 343;

        b.pages = 45;
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
