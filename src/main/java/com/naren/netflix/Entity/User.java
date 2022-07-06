package com.naren.netflix.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String userName;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private Integer age;

    @Column(nullable = false)
    private String gender;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinTable(name = "user_movies",
            joinColumns = @JoinColumn(name = "user_"),
            inverseJoinColumns = @JoinColumn(name = "movies_movie_id"))
    private Set<Movies> movies = new LinkedHashSet<>();

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinTable(name = "user_series",
            joinColumns = @JoinColumn(name = "user_"),
            inverseJoinColumns = @JoinColumn(name = "series_series_id"))
    private Set<Series> series = new LinkedHashSet<>();


    public void watches(Movies movie) {
        movies.add(movie);
    }


    public void watch(Series oneSeries) {
        series.add(oneSeries);
    }
}