package com.example.hotelbooking.hotelpackage.Service.userservice;

import com.example.hotelbooking.hotelpackage.models.Role;
import com.example.hotelbooking.hotelpackage.models.User;

public interface UserService {
    User createUser(String name, String email, String password, Role role);
    User findByEmail(String email);
    User getUserById(Long userId);
    User login(String email, String password);
    void deleteUser(Long UserId);
}
