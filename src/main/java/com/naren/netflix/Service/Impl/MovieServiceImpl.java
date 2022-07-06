package com.naren.netflix.Service.Impl;

import com.naren.netflix.Entity.Movies;
import com.naren.netflix.Repository.MoviesRepository;
import com.naren.netflix.Service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MoviesService {

    @Autowired
    private MoviesRepository moviesRepository;

    @Override
    public Movies newMovie(Movies movie) {
        return moviesRepository.save(movie);
    }

    @Override
    public Movies findById(Long movieId) {
        return moviesRepository.findById(movieId).orElseThrow(
                () -> new RuntimeException("Movie not found: " + movieId)
        );

    }


}
