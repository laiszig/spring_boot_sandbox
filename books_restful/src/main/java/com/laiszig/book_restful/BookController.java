package com.laiszig.book_restful;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    private List<Book> books = new ArrayList<>();

    @GetMapping("/books")
    public List<Book> getAll() {
        return books;
    }

    @PostMapping("/create")
    public Book createBook(@RequestBody Book book) {
        books.add(book);
        return book;
    }
}
