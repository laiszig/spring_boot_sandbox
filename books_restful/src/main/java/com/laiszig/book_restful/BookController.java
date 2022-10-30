package com.laiszig.book_restful;

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
    public Book getBook(@PathVariable int id) {
        for (int i = 0; i < books.size(); i++) {
            if (id == books.get(i).getId()) {
                return books.get(i);
            }
        }
        return null; //Temp
    }
}
