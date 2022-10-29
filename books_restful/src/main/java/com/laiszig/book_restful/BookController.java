package com.laiszig.book_restful;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("/books")
    public List<Book> getAll() {
        List<Book> books = new ArrayList<>();
        Book book1 = new Book();
        book1.setTitle("Harry Potter");
        book1.setAuthor("J.K. Rowling");
        books.add(book1);
        Book book2 = new Book();
        book2.setTitle("The Shining");
        book2.setAuthor("Stephen King");
        books.add(book2);
        return books;
    }
}
