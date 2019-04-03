package nl.yacht.books.designpatterns;

public class ComicBook extends Book {

    // NOTE!!!! package private constructor / default access
    ComicBook() {

    }

    private int howManyImages;

    public int getHowManyImages() {
        return howManyImages;
    }

    public void setHowManyImages(int howManyImages) {
        this.howManyImages = howManyImages;
    }
}
