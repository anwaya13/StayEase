package com.example.hotelbooking.hotelpackage.Service.userservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.hotelbooking.hotelpackage.exceptions.ApiRequestException;
import com.example.hotelbooking.hotelpackage.models.Role;
import com.example.hotelbooking.hotelpackage.models.User;
import com.example.hotelbooking.hotelpackage.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(String name, String email, String password, Role role) {
        // Check if email already exists
        Optional<User> existingUser = userRepository.findByEmail(email);
        if (existingUser != null) {
            throw new ApiRequestException("Email already registered!");
        }
        // Save the new user
        User user=new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        user.setRole(role);
        return userRepository.save(user);
    }


    @Override
    public User getUserById(Long userId) {
        return userRepository.findById(userId).orElseThrow(()-> new ApiRequestException("User not found!"));
    }

    @Override
    public User login(String email, String password) {
        Optional<User> userData = userRepository.findByEmail(email);
        if (userData.isEmpty()) {
                throw new ApiRequestException("User not found");
            }

            User user = userData.get();

            // Check if the password matches
            if ( !user.getPassword().equals(password)) {
                throw new ApiRequestException("Credentials not matching");
            }
            return userRepository.save(user);
        }


    @Override
    public void deleteUser(Long userId) {

        userRepository.deleteById(userId);
    }

    @Override
    public User findByEmail(String email) {

        return userRepository.findByEmail(email).orElse(null);
    }

}

