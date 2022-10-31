package com.laiszig.film_rest_api_mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FilmController  {

    private final List<Film> films = new ArrayList<>();

    @Autowired
    private FilmRepository filmRepository;

    @GetMapping("/films")
    public List<Film> getFilms() {
        return filmRepository.findAll();
    }
}
