package com.laiszig.book_api_thymeleaf_bootstrap;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void testAddNewBook(){
        Book book = new Book();
        book.setTitle("The Shining");
        book.setAuthor("Stephen King");
        book.setYear("1977");
        Book savedBook = bookRepository.save(book);

        Assertions.assertThat(savedBook).isNotNull();
        Assertions.assertThat(savedBook.getId()).isGreaterThan(0);

    }
}
