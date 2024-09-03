package com.myname.ticket_booking_system.Service;

import com.myname.ticket_booking_system.Entity.User;
import com.myname.ticket_booking_system.repositorys.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {
    private final UserRepository userRepository;

    public User registerUser(User user) {
        log.info("Registering user: {}", user.getUsername());
        return userRepository.save(user);
    }

    public Optional<User> getUserById(Long id) {
        log.info("Fetching user by ID: {}", id);
        return userRepository.findById(id);
    }
}
