package com.example.hotelbooking.hotelpackage.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hotelbooking.hotelpackage.models.Room;


public interface RoomRepository extends JpaRepository<Room, Long> {
    Optional<Room>  findByRoomId(Long roomId);
    List<Room> findAllByHotel_HotelId(Long hotelId);

}
