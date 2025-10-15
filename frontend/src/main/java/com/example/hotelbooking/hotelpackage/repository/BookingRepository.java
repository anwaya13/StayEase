package com.example.hotelbooking.hotelpackage.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hotelbooking.hotelpackage.models.Booking;
import com.example.hotelbooking.hotelpackage.models.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findAllByUser(User user); 
    Optional<Booking> findByRoom_RoomId(Long roomId);

}
