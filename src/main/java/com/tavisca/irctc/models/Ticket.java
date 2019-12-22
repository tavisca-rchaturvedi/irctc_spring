package com.tavisca.irctc.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.tavisca.irctc.enums.BerthType;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Entity
public class Ticket  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "booking_id")
    private int id;
    private int trainId;
    private String trainName;
    private Instant bookingDate;
    private Instant journeyDate;
    private double price;
    private BerthType berthType;
    private String source;
    private String destination;
    private int distance;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ticket")
    private List<Passenger> passengerList;


    public Ticket() {
    }

    public Ticket(int trainId, String trainName, Instant bookingDate, Instant journeyDate, double price, BerthType berthType, List<Passenger> passengerList, String source, String destination, int distance) {

        this.trainId = trainId;
        this.trainName = trainName;
        this.bookingDate = bookingDate;
        this.journeyDate = journeyDate;
        this.price = price;
        this.berthType = berthType;
        this.passengerList = passengerList;
        this.source = source;
        this.destination = destination;
        this.distance = distance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTrainId() {
        return trainId;
    }

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public Instant getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Instant bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Instant getJourneyDate() {
        return journeyDate;
    }

    public void setJourneyDate(Instant journeyDate) {
        this.journeyDate = journeyDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BerthType getBerthType() {
        return berthType;
    }

    public void setBerthType(BerthType berthType) {
        this.berthType = berthType;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    @JsonManagedReference
    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;

        for(Passenger p :passengerList)
            p.setTicket(this);
    }
}
