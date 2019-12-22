package com.tavisca.irctc.dao;

import com.tavisca.irctc.enums.BerthType;
import com.tavisca.irctc.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepo extends JpaRepository<Ticket, Integer> {

    @Query(value ="Select tf.fare_perKm*(s2.distance_travelled-s1.distance_travelled)*?3 as Fare" +
            " from train_fare_perKm as tf,stop as s1,stop as s2 " +
            "where s1.station_name=?4 and s2.station_name=?5 and s1.train_train_id=?1 and s2.train_train_id=?1" +
            " and tf.train_train_id=?1 and tf.fare_perKm_key=?2"
            ,nativeQuery = true)
    double calculateFare(int tid, int berthType, int seats, String src, String destination);
}
