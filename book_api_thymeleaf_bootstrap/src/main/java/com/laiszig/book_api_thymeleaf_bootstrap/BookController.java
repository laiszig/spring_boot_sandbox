package com.laiszig.book_api_thymeleaf_bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public String getAllBooks(Model model) {
        List<Book> books = bookService.listAll();
        model.addAttribute("books", books);
        return "books";
    }

    @GetMapping("/books/new")
    public String showNewForm(Model model){
        model.addAttribute("book", new Book());
        return "book_form";
    }

    @PostMapping("/books/save")
    public String saveBook(Book book) {
        bookService.save(book);
        return "redirect:/books";
    }
}
