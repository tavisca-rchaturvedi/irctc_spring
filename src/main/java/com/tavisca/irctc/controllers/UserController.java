package com.tavisca.irctc.controllers;


import java.util.List;
import com.tavisca.irctc.dao.StopRepo;
import com.tavisca.irctc.dao.TrainRepo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserController {

    @Autowired
    TrainRepo trainRepo;

    @Autowired
    StopRepo stopRepo;

    @GetMapping("/searchTrains/{source}/{destination}")
    public List<Object> searchTrains(@PathVariable String source, @PathVariable String destination){
        return stopRepo.searchTrain(source,destination);
    }
}
