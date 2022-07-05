package com.naren.netflix.Service.Impl;

import com.naren.netflix.Repository.MoviesRepository;
import com.naren.netflix.Service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MoviesService {

    @Autowired
    private MoviesRepository moviesRepository;

}
