package com.tavisca.irctc.models;

import com.tavisca.irctc.enums.BerthType;

import javax.persistence.*;
import java.time.Instant;
import java.util.Map;

@Entity
public class Stop {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private Instant arrivalTime;
    private Instant departureTime;
    private int distanceTravelled;

    @ElementCollection
    private Map<BerthType, Integer> currentAvailability;
    @ManyToOne(targetEntity = Station.class)
    private Station station;

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public Stop() {
    }

    public Stop(Instant arrivalTime, Instant departureTime, int distanceTravelled, Map<BerthType, Integer> currentAvailability, Station station) {

        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.distanceTravelled = distanceTravelled;
        this.currentAvailability = currentAvailability;
        this.station = station;
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
}
