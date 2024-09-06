package com.myname.ticket_booking_system.config;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class AuthRequest {
    private String username;
    private String password;

}
