package com.example.hotelbooking.hotelpackage.dto.request;

import com.example.hotelbooking.hotelpackage.models.Role;

public record CreateUserDto(String name, String email, String password, Role role ) {
    
}
