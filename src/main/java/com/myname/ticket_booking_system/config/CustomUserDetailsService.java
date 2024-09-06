package com.myname.ticket_booking_system.config;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.User;
import com.myname.ticket_booking_system.repositorys.UserRepository;

import java.util.ArrayList;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Поиск пользователя в базе данных
        com.myname.ticket_booking_system.Entity.User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        // Возвращаем пользователя как объект UserDetails
        return new org.springframework.security.core.userdetails.User(
                user.getUsername(), 
                user.getPassword(), 
                new ArrayList<>() // Здесь можно указать роли и права доступа
        );
    }
}
