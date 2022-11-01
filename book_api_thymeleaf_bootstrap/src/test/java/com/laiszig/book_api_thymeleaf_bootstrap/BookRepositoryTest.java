package com.laiszig.book_api_thymeleaf_bootstrap;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void testAddNewBook(){
        Book book = new Book();
        book.setTitle("Carrie");
        book.setAuthor("Stephen King");
        book.setYear("1977");
        Book savedBook = bookRepository.save(book);

        Assertions.assertThat(savedBook).isNotNull();
        Assertions.assertThat(savedBook.getId()).isGreaterThan(0);
    }

    @Test
    public void testListAllBooks() {
        Iterable<Book> books = bookRepository.findAll();
        Assertions.assertThat(books).hasSizeGreaterThan(0);

        for (Book book : books) {
            System.out.println(book);
        }
    }

    @Test
    public void testUpdateBook() {
        Integer bookId = 1;
        Optional<Book> optionalBook = bookRepository.findById(bookId);
        Book book = optionalBook.get();
        book.setYear("2000");
        bookRepository.save(book);

        Book updatedBook = bookRepository.findById(bookId).get();
        Assertions.assertThat(updatedBook.getYear()).isEqualTo("2000");
    }

    @Test
    public void testGetBookById() {
        Integer bookId = 1;
        Optional<Book> optionalBook = bookRepository.findById(bookId);
        Assertions.assertThat(optionalBook).isPresent();
        System.out.println(optionalBook.get());
    }

    @Test
    public void testDeleteBookById() {
        Integer bookId = 1;
        bookRepository.deleteById(bookId);

        Optional<Book> optionalBook = bookRepository.findById(bookId);
        Assertions.assertThat(optionalBook).isNotPresent();
    }
}
