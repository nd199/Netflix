package com.naren.netflix.Controller;

import com.naren.netflix.Entity.Series;
import com.naren.netflix.Service.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeriesController {

    @Autowired
    private SeriesService seriesService;

    @PostMapping("/series")
    public ResponseEntity<Series> addSeries(@RequestBody Series series) {
        return new ResponseEntity<Series>(seriesService.newSeries(series), HttpStatus.OK);
    }


}
