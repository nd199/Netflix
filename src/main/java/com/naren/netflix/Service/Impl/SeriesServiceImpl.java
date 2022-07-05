package com.naren.netflix.Service.Impl;

import com.naren.netflix.Entity.Series;
import com.naren.netflix.Repository.SeriesRepository;
import com.naren.netflix.Service.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeriesServiceImpl implements SeriesService {

    @Autowired
    private SeriesRepository seriesRepository;

    @Override
    public Series newSeries(Series series) {
        return seriesRepository.save(series);
    }
}
