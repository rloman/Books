package nl.yacht.books.designpatterns;

public final class BookFactory {

    public static Book getComicBook() {

        ComicBook result = new ComicBook();
        result.setHowManyImages(10);

        return result;

    }

    // Utility class hence private constructor so no instance
    private BookFactory() {

    }
}
