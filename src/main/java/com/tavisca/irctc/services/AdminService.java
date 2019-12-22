package com.tavisca.irctc.services;

import com.tavisca.irctc.dao.TrainRepo;
import com.tavisca.irctc.models.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    TrainRepo trainRepo;


    public void addTrain(Train train){
        trainRepo.save(train);
    }

    public Train findTrain(int id) {
        return trainRepo.findById(id).get();
    }

    public void findTrainByNames(String source, String destination){

    };

    public void deleteTrainById(int id) {
        trainRepo.deleteById(id);
    }


    public Train modifyTrain(Train train) {
        trainRepo.deleteById(train.getId());
        return trainRepo.save(train);
    }

    public List<Train> findAllTrains() {
        return trainRepo.findAll();
    }
}
