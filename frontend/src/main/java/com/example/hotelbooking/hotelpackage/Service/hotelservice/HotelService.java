package com.example.hotelbooking.hotelpackage.Service.hotelservice;

import com.example.hotelbooking.hotelpackage.models.Hotel;

import java.util.List;
import java.util.Optional;

public interface HotelService {
    Hotel addHotel(String name, String location, String description, String contactInfo, int totalRooms);

    Optional<Hotel> getHotelById(Long hotelId);

    List<Hotel> getAllHotels();

    void deleteHotel(Long hotelId);

    Hotel updateHotel(Long hotelId, String name, String location, String description, String contactInfo, int totalRooms);
}

