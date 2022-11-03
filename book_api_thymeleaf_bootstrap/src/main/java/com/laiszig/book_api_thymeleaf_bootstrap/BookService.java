package com.laiszig.book_api_thymeleaf_bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> listAll() {
        return (List<Book>) bookRepository.findAll();
    }

    public void save(Book book) {
        bookRepository.save(book);
    }
}
