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

//        Station pune = new Station( "Pune");
//        Station mumbai = new Station("Mumbai");
//
//
//        List<Stop> stops =new ArrayList<Stop>(){{
//            add(new Stop(Instant.now(), Instant.now(), 200, new HashMap<BerthType, Integer>(){{put(BerthType.SECOND_AC, 5);}}, "pune"));
//            add(new Stop(Instant.now(), Instant.now(), 200, new HashMap<BerthType, Integer>(){{put(BerthType.FIRST_AC, 5);}}, "mumbai"));
//        }};
//
//        Map<BerthType, Double> fare = new HashMap<BerthType, Double>(){{
//            put(BerthType.SECOND_AC, 5.2);
//            put(BerthType.FIRST_AC, 3.0);
//        }};
//        Map<BerthType, Integer> available = new HashMap<BerthType, Integer>(){{
//            put(BerthType.SECOND_AC, 5);
//            put(BerthType.FIRST_AC, 3);
//        }};
//
//        Train train = new Train(12828, "Intercity Express", Instant.now(), stops, fare, available );
        adminService.addTrain(train);
//        return  HttpStatus.CREATED:HttpStatus.BAD_REQUEST;
    }

    @GetMapping("/findTrain/{id}")
    public Train findTrain(@PathVariable  int id){
        return adminService.findTrain(id);
    }

    @DeleteMapping("/deleteTrain/{id}")
    public void deleteTrain(@PathVariable int id){
        adminService.deleteTrainById(id);
    }

    @PutMapping("modifyTrains")
    public Train modifyTrain(@RequestBody Train train){
        return adminService.modifyTrain(train);
    }

    @GetMapping("/trains")
    public List<Train> showAllTrain(){
        return adminService.findAllTrains();
    }

}
