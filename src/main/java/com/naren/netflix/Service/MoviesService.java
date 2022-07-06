package com.naren.netflix.Service;

import com.naren.netflix.Entity.Movies;

public interface MoviesService {
    Movies newMovie(Movies movie);

    Movies findById(Long movieId);
}
