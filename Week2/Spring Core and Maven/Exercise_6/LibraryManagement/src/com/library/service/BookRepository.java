package com.library.service;


import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    String Name;
    int id;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return Name;
    }

}
