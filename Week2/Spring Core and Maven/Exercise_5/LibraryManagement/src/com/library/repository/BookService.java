package com.library.repository;

import com.library.service.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

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

    BookRepository br;

    @Autowired

    public void setter(BookRepository br) {
        this.br = br;
    }

}
