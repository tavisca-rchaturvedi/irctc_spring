package com.tavisca.irctc.models;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Entity
public class Ticket  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookingId;

    private Instant bookingDate;
    private Instant journeyDate;
    private double price;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ticket")
    private List<Passenger> passengerList;
    private String source;
    private String destination;
    private int distance;

    public Ticket(Instant bookingDate, Instant journeyDate, double price, List<Passenger> passengerList, String source, String destination, int distance) {
        this.bookingDate = bookingDate;
        this.journeyDate = journeyDate;
        this.price = price;
        this.passengerList = passengerList;
        this.source = source;
        this.destination = destination;
        this.distance = distance;
    }

    public Ticket() {
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

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;

        for(Passenger passenger : passengerList){
            passenger.setTicket(this);
        }
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
}
