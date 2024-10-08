package com.myname.ticket_booking_system.repositorys;

import com.myname.ticket_booking_system.Entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface EventRepository extends JpaRepository<Event, Long> {

    Optional<Event> findByName(String name);
    

    List<Event> findByEventDate(Date eventDate);
    

    List<Event> findByLocation(String location);
}
