package org.example.bookstoreapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookstoreApiApplication {

    public static void main(String[] args) {

        System.out.println("Spring Web, Spring Boot DevTools and Lombok dependencies added.");

        SpringApplication.run(BookstoreApiApplication.class, args);
    }

}
