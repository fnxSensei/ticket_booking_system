package com.myname.ticket_booking_system.Service;

import com.myname.ticket_booking_system.Entity.Ticket;
import com.myname.ticket_booking_system.repositorys.TicketRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class TicketService {
    private final TicketRepository ticketRepository;

    public Ticket bookTicket(Ticket ticket) {
        log.info("Booking ticket for user: {}", ticket.getUser().getUsername());
        return ticketRepository.save(ticket);
    }

    public Optional<Ticket> getTicketById(Long id) {
        log.info("Fetching ticket by ID: {}", id);
        return ticketRepository.findById(id);
    }
}
