package com.library.repository;

public class BookService {
    String Book_name;
    String Author;

    public void setBook_name(String bookName) {
        this.Book_name = bookName;
    }
    public void setAuthor(String author) {
        this.Author = author;
    }

    public String getBook_name() {
        return Book_name;
    }
    public String getAuthor() {
        return Author;
    }

}
