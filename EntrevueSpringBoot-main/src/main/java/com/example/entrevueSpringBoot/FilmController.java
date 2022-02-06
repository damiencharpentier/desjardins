package com.example.entrevueSpringBoot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FilmController {

    private  FilmRepository repository;


    public FilmController(FilmRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/film/{id}")
    Film getFilm(@PathVariable Long id) {
        return repository.findById(id).get();
    }

    @PostMapping("/api/film")
    ResponseEntity<Film> addFilm(@RequestBody Film film) {
        repository.save(film);
        return new ResponseEntity<>(film, HttpStatus.CREATED);
    }
}
