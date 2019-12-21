package com.tavisca.irctc.dao;

import com.tavisca.irctc.models.Stop;
import com.tavisca.irctc.models.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StopRepo extends JpaRepository<Stop,Integer> {
//    @Query("SELECT s1, s2 FROM Stop s1, Stop s2 where s1.train_id = s2.train_id and s1.station_name like ?1% and s2.station_name like ?2% and s1.stop_id < s2.stop_id;")
//    public List<Stop> searchTrainByStations(String source, String destination);

//
//    @Query(value = "Select * from train,stop as s1,stop as s2 where train.train_id=s1.train_train_id " +
//            "and s2.train_train_id=train.train_id and s1.station_name=?1 and s2.station_name in" +
//            "(Select station_name from s2 where station_name=?2 and s1.stop_id<s2.stop_id)" ,nativeQuery = true)
//    public List<Object> searchTrain(String source,String destination);

}
