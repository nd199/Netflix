package com.naren.netflix.Entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class Movies implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long movieId;

    @Column(nullable = false)
    private String movieName;

    @Column(nullable = false)
    private String movieType;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date yearOfRelease;


}