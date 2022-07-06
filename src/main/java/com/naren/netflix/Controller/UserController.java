package com.naren.netflix.Controller;

import com.naren.netflix.Entity.Movies;
import com.naren.netflix.Entity.Series;
import com.naren.netflix.Entity.User;
import com.naren.netflix.Service.MoviesService;
import com.naren.netflix.Service.SeriesService;
import com.naren.netflix.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private MoviesService moviesService;

    @Autowired
    private SeriesService seriesService;

    @PostMapping("/user")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        return new ResponseEntity<User>(userService.newUser(user), HttpStatus.OK);
    }


    @PutMapping("movie/{movieId}/user/{userId}")
    public ResponseEntity<User> watchMovie(@PathVariable("userId") Long userId,
                                           @PathVariable("movieId") Long movieId) {

        User user = userService.findById(userId);
        Movies movie = moviesService.findById(movieId);
        user.watches(movie);
        return new ResponseEntity<User>(userService.watchedBy(user), HttpStatus.ACCEPTED);
    }

    @PutMapping("series/{seriesId}/user/{userId}")
    public ResponseEntity<User> watchSeries(@PathVariable("userId") Long userId,
                                            @PathVariable("seriesId") Long seriesId) {

        User user = userService.findById(userId);
        Series oneSeries = seriesService.findById(seriesId);
        user.watch(oneSeries);
        return new ResponseEntity<User>(userService.watchedBy(user), HttpStatus.ACCEPTED);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<User> getUser(@PathVariable("userId") Long userId) {
        return new ResponseEntity<User>(userService.findById(userId), HttpStatus.OK);
    }


}
