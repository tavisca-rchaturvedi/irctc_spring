package com.tavisca.irctc.services;

import com.tavisca.irctc.dao.TrainRepo;
import com.tavisca.irctc.models.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

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
}
