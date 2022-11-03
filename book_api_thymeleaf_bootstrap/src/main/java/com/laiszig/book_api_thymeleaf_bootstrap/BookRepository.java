package com.laiszig.book_api_thymeleaf_bootstrap;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {

    public Long countById(Integer id);
}
