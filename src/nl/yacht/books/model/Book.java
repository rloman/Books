package nl.yacht.books.model;

public class Book {

    private int pages;
    private double price;

    public Book(int pages){
        this.pages = pages;
    }

    public Book() {

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
}
