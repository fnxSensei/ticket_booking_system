package com.myname.ticket_booking_system.Service;

import com.myname.ticket_booking_system.Entity.Event;
import com.myname.ticket_booking_system.repositorys.EventRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class EventService {
    private final EventRepository eventRepository;

    public Event createEvent(Event event) {
        log.info("Creating event: {}", event.getName());
        return eventRepository.save(event);
    }

    public Optional<Event> getEventById(Long id) {
        log.info("Fetching event by ID: {}", id);
        return eventRepository.findById(id);
    }
}
