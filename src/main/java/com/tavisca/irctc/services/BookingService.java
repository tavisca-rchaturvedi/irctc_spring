package com.tavisca.irctc.services;

import com.tavisca.irctc.dao.TicketRepo;
import com.tavisca.irctc.models.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    TicketRepo ticketRepo;

    public void addTicket(Ticket ticket){
        ticketRepo.save(ticket);
    }

    public Optional<Ticket> findById(int id){
        return ticketRepo.findById(id);
    }


}
