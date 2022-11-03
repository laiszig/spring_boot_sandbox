package com.laiszig.book_api_thymeleaf_bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Book get(Integer id) throws BookNotFoundException {
        Optional<Book> result = bookRepository.findById(id);
        if(result.isPresent()) {
            return result.get();
        }
        throw new BookNotFoundException("Could not find any books with ID " + id);
    }

    public void delete(Integer id) throws BookNotFoundException {
        Long count = bookRepository.countById(id);
        if(count == null || count == 0) {
            throw new BookNotFoundException("Could not find any users with ID " + id);
        }
        bookRepository.deleteById(id);
    }
}
