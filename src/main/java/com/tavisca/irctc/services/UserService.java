package com.tavisca.irctc.services;

import java.util.List;
import com.tavisca.irctc.dao.StopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    StopRepo stopRepo;

    public List<Object> searchTrainByStation(String source,String destination){
        return stopRepo.searchTrain(source,destination);
    }
}
