package com.laiszig.book_restful;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    private List<Book> books = new ArrayList<>();
    private int id = 1;

    @GetMapping("/books")
    public List<Book> getAll() {
        return books;
    }

    @PostMapping("/books")
    public Book createBook(@RequestBody Book book) {
        books.add(book);
        book.setId(id++);
        return book;
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<Book> getBook(@PathVariable int id) {
        for(Book book : books) {
            if (id == book.getId()) {
                return new ResponseEntity<>(book, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
