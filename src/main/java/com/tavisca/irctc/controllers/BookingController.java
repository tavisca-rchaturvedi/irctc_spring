package com.tavisca.irctc.controllers;

import com.tavisca.irctc.dao.TicketRepo;
import com.tavisca.irctc.enums.Gender;
import com.tavisca.irctc.models.Passenger;
import com.tavisca.irctc.models.Ticket;
import com.tavisca.irctc.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@RestController
public class BookingController {

    @Autowired
    BookingService bookingService;

    @GetMapping("/findTicket/{id}")
    public Ticket searchTicket(@PathVariable int id){
        return bookingService.findById(id).get();
    }

    @PostMapping("/bookTicket")
    public void bookTicket(@RequestBody Ticket ticket){


        List<Passenger> passengers = new ArrayList<Passenger>(){{
            add(new Passenger("A", Gender.MALE, 20));
            add(new Passenger("B", Gender.FEMALE, 20));
        }};

        Ticket ticket1 = new Ticket(Instant.now(), Instant.now(), 20.0, passengers, "Pune", "Mumbai", 400);

        bookingService.addTicket(ticket1);
    }

}