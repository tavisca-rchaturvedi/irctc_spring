package com.tavisca.irctc.controllers;

import com.tavisca.irctc.models.Train;
import com.tavisca.irctc.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController()
@CrossOrigin(origins = "*")
public class AdminController {

    @Autowired
    AdminService adminService;

    @PostMapping("/addTrain")
    public void addTrain(@RequestBody Train train) {

        adminService.addTrain(train);
    }

    @GetMapping("/findTrain/{id}")
    public Train findTrain(@PathVariable  int id){
        return adminService.findTrain(id);
    }

    @DeleteMapping("/deleteTrain/{id}")
    public void deleteTrain(@PathVariable int id){
        adminService.deleteTrainById(id);
    }

    @PutMapping("/modifyTrains")
    public Train modifyTrain(@RequestBody Train train){
        return adminService.modifyTrain(train);
    }

    @GetMapping("/trains")
    public List<Train> showAllTrain(){
        return adminService.findAllTrains();
    }

}
