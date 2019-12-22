package com.tavisca.irctc.dao;

import com.tavisca.irctc.models.Stop;
import com.tavisca.irctc.models.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StopRepo extends JpaRepository<Stop,Integer> {

    @Query(value = "Select t.train_id,t.train_name,sum(sca.current_availability) as ca " +
            "from train as t,stop as s1,stop as s2,stop_current_availability as sca " +
            "where t.train_id=s1.train_train_id and s2.train_train_id=t.train_id " +
            " and sca.stop_stop_id=s2.stop_id and s1.station_name=?1 and s2.station_name in " +
            "(Select station_name from stop where station_name=?2 and s1.stop_id<s2.stop_id) " +
            "group by sca.stop_stop_id" ,nativeQuery = true)
     List<Object> searchTrain(String source,String destination);

}
