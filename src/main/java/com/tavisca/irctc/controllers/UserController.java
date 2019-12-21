package com.tavisca.irctc.controllers;


import java.util.List;
import com.tavisca.irctc.dao.StopRepo;
import com.tavisca.irctc.dao.TrainRepo;

import com.tavisca.irctc.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/searchTrains/{source}/{destination}")
    public List<Object> searchTrains(@PathVariable String source, @PathVariable String destination){
        return userService.searchTrainByStation(source,destination);
    }
}
