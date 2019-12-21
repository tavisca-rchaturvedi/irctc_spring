package com.tavisca.irctc.dao;

import java.util.List;
import com.tavisca.irctc.models.Stop;
import com.tavisca.irctc.models.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface TrainRepo extends JpaRepository<Train,Integer> {

}
