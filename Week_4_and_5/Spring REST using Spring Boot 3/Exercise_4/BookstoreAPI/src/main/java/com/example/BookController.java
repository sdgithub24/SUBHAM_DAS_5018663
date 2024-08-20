package com.example;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BookController {



    @PostMapping("/books")
    public ResponseEntity<Bookentity> saveProduct(@RequestBody Bookentity book) {
        return ResponseEntity.ok().body(book);
    }


    @GetMapping("/books")
    public List<Bookentity> getAllProducts() {
        List<Bookentity> books = new ArrayList<>();
        return books;

    }




    @PutMapping("/books/{id}")
    public ResponseEntity<Bookentity> updateProduct(@PathVariable Long id, @RequestBody Bookentity book) {
        Bookentity updatedBook = book;
        return ResponseEntity.ok().body(updatedBook);
    }


    @DeleteMapping("/books/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id) {
        return ResponseEntity.ok().body("Deleted");
    }

    @GetMapping("/books")
    public List<Bookentity> getBooks(@RequestParam(required = false) String title,@RequestParam(required = false) String author){
        List<Bookentity> books = new ArrayList<>();
        return books;
    }


    @PostMapping(consumes = "application/json", produces = "application/json")
    public Customer createCustomer(@RequestBody Customer customer) {
        customer.setId(1L);
        return customer;
    }

}
