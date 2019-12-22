package com.tavisca.irctc.controllers;


import java.util.List;
import java.util.Optional;

import com.tavisca.irctc.models.Train;
import com.tavisca.irctc.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin(origins = "*")

public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/searchTrains/{source}/{destination}")
    public List<Object> searchTrains(@PathVariable String source, @PathVariable String destination){
        return userService.searchTrainByStation(source,destination);
    }

    @GetMapping("trains/{id}")
    public Optional<Train> searchTrainById(@PathVariable int id){
        return userService.searchTrainByTrainId(id);
    }
}
