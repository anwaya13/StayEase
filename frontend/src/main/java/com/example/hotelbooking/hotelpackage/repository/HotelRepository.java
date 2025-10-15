package com.example.hotelbooking.hotelpackage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hotelbooking.hotelpackage.models.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long> {

    
}
