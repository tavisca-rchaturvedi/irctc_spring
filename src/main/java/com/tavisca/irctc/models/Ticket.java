package com.tavisca.irctc.models;

import java.time.Instant;
import java.util.List;

public class Ticket {
    private int bookingId;

    private Instant bookingDate;
    private Instant journeyDate;
    private double price;
    private List<Passenger> passengerList;
    private Stop source;
    private Stop destination;
    private int distance;

}
