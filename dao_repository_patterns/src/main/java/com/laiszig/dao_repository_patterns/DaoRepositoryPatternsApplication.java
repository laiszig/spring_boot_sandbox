package com.laiszig.dao_repository_patterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DaoRepositoryPatternsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaoRepositoryPatternsApplication.class, args);
    }

}


/*
The Data Access Object Pattern, aka DAO Pattern, is an abstraction of data persistence and is considered closer
to the underlying storage, which is often table-centric.

Repository is a mechanism for encapsulating storage, retrieval, and search behavior, which emulates a collection of objects.
It mediates between the domain and data mapping layers using a collection-like interface for accessing domain objects.

However, DAO seems a perfect candidate to access the data, and a repository is an ideal way to implement a business use-case.
*/