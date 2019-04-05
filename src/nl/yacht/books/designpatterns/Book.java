package nl.yacht.books.designpatterns;


import java.time.LocalDate;

// interface or abstract class
public abstract class Book {

    private String title;
    private LocalDate dateOfPublishing;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDateOfPublishing() {
        return dateOfPublishing;
    }

    public void setDateOfPublishing(LocalDate dateOfPublishing) {
        this.dateOfPublishing = dateOfPublishing;
    }
}
