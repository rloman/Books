package nl.yacht.books.unittests;

import nl.yacht.books.model.Book;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class BookTest {

    private Book book;


    public BookTest() {
        this.book = new Book(10);
    }

    @Test
    public void testBookConstructorAndGetForTitle() {

        Assert.assertEquals(10, this.book.getPages());
    }

    @Test
    public void testBookGetAndSetForTitle() {

        this.book.setPages(50);

        Assert.assertEquals(50, this.book.getPages());
    }

    @Test
    public void testGetAndSetTitle() {

        this.book.setTitle("Wuthering Heights");
        Assert.assertEquals("Wuthering Heights", this.book.getTitle());
    }

    @Test
    public void testFail() {
        try {
            System.out.println(this.book.getTitle().length());
            Assert.fail("I should never come here, since the previous SHOULD throw an Exception");
        }
        catch(NullPointerException npe) {
            //OK
        }
    }


    @After
    public void tearDown() {
        this.book = null;
    }
}
