package com.laiszig.film_rest_api_mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {

    @Autowired
    private FilmRepository filmRepository;

    public List<Film> listAllFilms() {
        return filmRepository.findAll();
    }

    public void saveFilm(Film film) {
        filmRepository.save(film);
    }

    public Film getFilm(int id) {
        return filmRepository.findById(id).get();
    }

    public void deleteFilm(int id) {
        filmRepository.deleteById(id);
    }
}
