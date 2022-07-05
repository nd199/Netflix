package com.naren.netflix.Repository;

import com.naren.netflix.Entity.Series;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeriesRepository extends JpaRepository<Series, Long> {
}