package com.example.hotelbooking.hotelpackage.Service.userservice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.example.hotelbooking.hotelpackage.exceptions.ApiRequestException;
import com.example.hotelbooking.hotelpackage.models.Role;
import com.example.hotelbooking.hotelpackage.models.User;
import com.example.hotelbooking.hotelpackage.repository.UserRepository;

public class UserServiceImplTest {

    @InjectMocks
    private UserServiceImpl userService;

    @Mock
    UserRepository userRepository;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCreateUser() {
        String name="Name";
        String email="email@gmail.com";
        String password="Password";
        Role role=Role.USER;

        User user=new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        user.setRole(role); 
        
        Mockito.when(userRepository.findByEmail(email)).thenReturn(Optional.of(user));
        Mockito.when(userRepository.save(user)).thenReturn(user);
        assertThrows(ApiRequestException.class, () ->  userService.createUser(name,email, password, role));
    }
    @Test
    void testDeleteUser() {
        Long userId=0L;
        Mockito.doNothing().when(userRepository).deleteById(userId);
    }

     
}
