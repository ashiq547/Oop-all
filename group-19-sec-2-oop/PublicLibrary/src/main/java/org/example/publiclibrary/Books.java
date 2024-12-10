package org.example.publiclibrary;

import java.io.Serializable;
import java.time.LocalDate;

public class Books implements Serializable {
    public String bookID;
    public String bookName;
    public LocalDate dateofpublish;
    public String genre;

    public Books(String bookID, String bookName, LocalDate dateofpublish, String genre) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.dateofpublish = dateofpublish;
        this.genre = genre;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public LocalDate getDateofpublish() {
        return dateofpublish;
    }

    public void setDateofpublish(LocalDate dateofpublish) {
        this.dateofpublish = dateofpublish;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookID='" + bookID + '\'' +
                ", bookName='" + bookName + '\'' +
                ", dateofpublish=" + dateofpublish +
                ", genre='" + genre + '\'' +
                '}';
    }
}
