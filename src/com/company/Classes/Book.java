package com.company.Classes;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String bookName;
    private String Author;
    private Integer paperNumber;


    public String getBookName() {
        return bookName;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getAuthor() {
        return Author;
    }

    public void setPaperNumber(Integer paperNumber) {
        this.paperNumber = paperNumber;
    }

    public Integer getPaperNumber() {
        return paperNumber;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
