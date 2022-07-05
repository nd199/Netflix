package com.naren.netflix.Entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class Series implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long seriesId;

    @Column(nullable = false)
    private String seriesName;

    @Column(nullable = false)
    private String seriesType;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date yearOfRelease;

}