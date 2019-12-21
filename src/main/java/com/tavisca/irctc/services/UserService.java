package com.tavisca.irctc.services;

import java.util.List;
import java.util.Optional;

import com.tavisca.irctc.dao.StopRepo;
import com.tavisca.irctc.dao.TrainRepo;
import com.tavisca.irctc.models.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    TrainRepo trainRepo;
    @Autowired
    StopRepo stopRepo;

    public List<Object> searchTrainByStation(String source,String destination){
        return stopRepo.searchTrain(source,destination);
    }

    public Optional<Train> searchTrainByTrainId(int id) {
        return trainRepo.findById(id);
    }
}
