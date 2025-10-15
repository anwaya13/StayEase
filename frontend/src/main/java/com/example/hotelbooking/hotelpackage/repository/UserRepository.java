package com.example.hotelbooking.hotelpackage.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hotelbooking.hotelpackage.models.User;


public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    Optional<User>  findByUserId(Long userId); 
}



















// package com.hotelpackage.repository;

// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

// import com.example.hotelbooking.hotelpackage.entity.User;

// @Repository
// public interface UserRepository extends JpaRepository<User, Long> {
//     User findByEmail(String email); // Optional: Find user by email if needed
// }
