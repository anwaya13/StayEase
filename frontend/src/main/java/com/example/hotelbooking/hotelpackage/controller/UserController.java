package com.example.hotelbooking.hotelpackage.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hotelbooking.hotelpackage.Service.userservice.UserService;
import com.example.hotelbooking.hotelpackage.dto.request.CreateUserDto;
import com.example.hotelbooking.hotelpackage.models.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/web/api/user")

public class UserController {
    private UserService userService;
    UserController (UserService userService){

        this.userService=userService;
    }

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody CreateUserDto data ) {
        System.out.println("data " + data.toString());
        return ResponseEntity.status(201).body(userService.createUser(data.name(), data.email(), data.password(), data.role()));
    }

    
    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteUser(@RequestParam("userId") Long userId){
        userService.deleteUser(userId);
        return ResponseEntity.status(204).body("Deletion successful");
    }
}
    
    

//     @GetMapping("/display")
//     public ResponseEntity<User> displayUser(@RequestParam("email") String email) {
//         <User> user = userService.getUserTable(username);return ResponseEntity.ok(userTable);
//     }
// }
// @PostMapping("/update")
// public ResponseEntity<UserTable> updateUser(@RequestBody UserDto userDto) {
//     UserTable userTable = userService.updateUserTable(userDto.name(),userDto.email(),userDto.password());
//     return ResponseEntity.ok(userTable);
// }

// }