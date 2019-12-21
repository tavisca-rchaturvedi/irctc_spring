package com.tavisca.irctc.models;

import com.tavisca.irctc.enums.BerthType;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;
import java.util.Map;

@Entity
public class Train {
    @Id
    @Column(name="train_id")
    private int id;
    @Column(name="train_name")
    private String name;
    private Instant originatingTime;

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "train")
    private List<Stop> stops;


    @ElementCollection
    private Map<BerthType, Double> farePerKM;
    @ElementCollection
    private Map<BerthType, Integer> totalSeats;

    public Train() {
    }

    public Train(int id, String name, Instant originatingTime, List<Stop> stops, Map<BerthType, Double> farePerKM, Map<BerthType, Integer> totalSeats) {
        this.id = id;
        this.name = name;
        this.originatingTime = originatingTime;
        this.stops = stops;
        this.farePerKM = farePerKM;
        this.totalSeats = totalSeats;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getOriginatingTime() {
        return originatingTime;
    }

    public void setOriginatingTime(Instant originatingTime) {
        this.originatingTime = originatingTime;
    }

    public List<Stop> getStops() {
        return stops;
    }

    public void setStops(List<Stop> stops) {
        this.stops = stops;

        for(Stop stop : stops)
            stop.setTrain(this);

    }

    public Map<BerthType, Double> getFarePerKM() {
        return farePerKM;
    }

    public void setFarePerKM(Map<BerthType, Double> farePerKM) {
        this.farePerKM = farePerKM;
    }

    public Map<BerthType, Integer> getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(Map<BerthType, Integer> totalSeats) {
        this.totalSeats = totalSeats;
    }
}
