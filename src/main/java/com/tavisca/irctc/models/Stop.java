package com.tavisca.irctc.models;

import com.tavisca.irctc.enums.BerthType;
import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Map;

@Entity
//@IdClass(StopId.class)
public class Stop implements Serializable {
//    @Id
//    private int trainId;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "stop_id")
    private int id;

    private Instant arrivalTime;
    private Instant departureTime;
    private int distanceTravelled;

    @ElementCollection
    private Map<BerthType, Integer> currentAvailability;

    private String stationName;

    @ManyToOne
    private Train train;

    public Stop() {
    }

    public Stop(Instant arrivalTime, Instant departureTime, int distanceTravelled, Map<BerthType, Integer> currentAvailability, String stationName) {

        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.distanceTravelled = distanceTravelled;
        this.currentAvailability = currentAvailability;
        this.stationName = stationName;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Instant getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Instant arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Instant getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Instant departureTime) {
        this.departureTime = departureTime;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setDistanceTravelled(int distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }

    public Map<BerthType, Integer> getCurrentAvailability() {
        return currentAvailability;
    }

    public void setCurrentAvailability(Map<BerthType, Integer> currentAvailability) {
        this.currentAvailability = currentAvailability;
    }



    @Override
    public String toString() {
        return "Stop{" +
                "id=" + id +
                ", arrivalTime=" + arrivalTime +
                ", departureTime=" + departureTime +
                ", distanceTravelled=" + distanceTravelled +
                ", currentAvailability=" + currentAvailability +
                ", stationName='" + stationName + '\'' +
                '}';
    }
}
