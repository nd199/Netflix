package com.naren.netflix.Controller;

import com.naren.netflix.Entity.Movies;
import com.naren.netflix.Service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoviesController {

    @Autowired
    private MoviesService moviesService;

    @PostMapping("/movie")
    public ResponseEntity<Movies> addMovie(@RequestBody Movies movie) {
        return new ResponseEntity<Movies>(moviesService.newMovie(movie), HttpStatus.OK);
    }
}
