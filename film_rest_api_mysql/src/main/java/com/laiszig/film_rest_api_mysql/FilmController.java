package com.laiszig.film_rest_api_mysql;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class FilmController  {

    private final List<Film> films = new ArrayList<>();

    @Autowired
    private FilmRepository filmRepository;

    @GetMapping("/films")
    public List<Film> getFilms() {
        return filmRepository.findAll();
    }

    @PostMapping("/films")
    public ResponseEntity<Film> addFilm(@RequestBody Film film){
        filmRepository.save(film);
        return new ResponseEntity<>(film, HttpStatus.CREATED);
    }

    @GetMapping("/films/{id}")
    public ResponseEntity<Film> getFilm(@PathVariable int id) {
        try {
            Film film = filmRepository.findById(id).get();
            return new ResponseEntity<>(film, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
