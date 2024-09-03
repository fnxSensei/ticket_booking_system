package com.myname.ticket_booking_system.repositorys;

import com.myname.ticket_booking_system.Entity.Event;
import com.myname.ticket_booking_system.Entity.Ticket;
import com.myname.ticket_booking_system.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

    List<Ticket> findByUser(User user);
    

    List<Ticket> findByEvent(Event event);
    

    List<Ticket> findByIsPaid(boolean isPaid);
}
