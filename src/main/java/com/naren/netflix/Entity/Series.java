package com.naren.netflix.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
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

    @JsonIgnore
    @ManyToMany(mappedBy = "series", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    private Set<User> users = new LinkedHashSet<>();

}