package com.naren.netflix.Repository;

import com.naren.netflix.Entity.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesRepository extends JpaRepository<Movies, Long> {
}