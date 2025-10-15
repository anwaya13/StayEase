package com.example.hotelbooking.hotelpackage.Service.roomservice;

import com.example.hotelbooking.hotelpackage.models.Room;
import java.util.List;
import java.util.Optional;

public interface RoomService {
    Room addRoom(String name, double price, String description, String type, String amenities,Long hotelId);
    Optional<Room> getRoomById(Long roomId);
    List<Room> getAllRooms();
    List<Room> findAllByHotelId(Long hotelId);
    void deleteRoom(Long roomId);
}
