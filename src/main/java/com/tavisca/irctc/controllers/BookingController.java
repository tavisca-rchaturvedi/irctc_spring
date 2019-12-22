package com.tavisca.irctc.controllers;

import java.util.List;
import com.tavisca.irctc.models.Ticket;
import com.tavisca.irctc.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*")

public class BookingController {

    @Autowired
    BookingService bookingService;

    @GetMapping("/findTicket/{id}")
    public Ticket searchTicket(@PathVariable int id){
        return bookingService.findById(id).get();
    }

    @PostMapping("/bookTicket")
    public void bookTicket(@RequestBody Ticket ticket){
        bookingService.addTicket(ticket);
    }

    @GetMapping("/getFare/{tid}/{berthType}/{seats}/{src}/{destination}")
    public double getFare(@PathVariable int tid,@PathVariable String berthType,@PathVariable int seats,
                          @PathVariable String src,@PathVariable String destination) {
        return bookingService.calculateFare(tid,berthType,seats,src,destination);
    }

    @GetMapping("/bookedTickets/{id}")
    public List<Ticket> getBookedTickets(@PathVariable int id){
        return bookingService.findBookedTickets(id);
    }


}
