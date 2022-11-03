package com.laiszig.book_api_thymeleaf_bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
        model.addAttribute("pageTitle", "Add New Book");
        return "book_form";
    }

    @PostMapping("/books/save")
    public String saveBook(Book book, RedirectAttributes redirectAttributes) {
        bookService.save(book);
        redirectAttributes.addFlashAttribute("message", "The book has been saved successfully.");
        return "redirect:/books";
    }

    @GetMapping("/books/edit/{id}")
    public String showEditForm(@PathVariable("id") Integer id, Model model, RedirectAttributes redirectAttributes) {
        try {
            Book book = bookService.get(id);
            model.addAttribute("book", book);
            model.addAttribute("pageTitle", "Edit Book (ID: "+ id + ")");
            return "book_form";
        } catch (BookNotFoundException e) {
            redirectAttributes.addFlashAttribute("message", "The book has been saved successfully.");
        return "redirect:/books";
        }
    }

    @GetMapping("/books/delete/{id}")
    public String deleteBook(@PathVariable("id") Integer id, RedirectAttributes redirectAttributes) {
        try {
            bookService.delete(id);
            redirectAttributes.addFlashAttribute("message", "The book ID " + id + " has been deleted.");
        } catch (BookNotFoundException e) {
            redirectAttributes.addFlashAttribute("message", e.getMessage());
        }
        return "redirect:/books";
    }
}
