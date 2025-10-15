package com.example.hotelbooking.hotelpackage.Service.roomservice;

import com.example.hotelbooking.hotelpackage.Service.hotelservice.HotelService;
import com.example.hotelbooking.hotelpackage.exceptions.ApiRequestException;
import com.example.hotelbooking.hotelpackage.models.Hotel;
import com.example.hotelbooking.hotelpackage.models.Room;
import com.example.hotelbooking.hotelpackage.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;
    private final HotelService hotelService;

    public RoomServiceImpl(RoomRepository roomRepository, HotelService hotelService) {
        this.roomRepository = roomRepository;
        this.hotelService=hotelService;
    }

    @Override
    public Room addRoom(String name, double price, String description, String type, String amenities,Long hotelId) {
        Room room=new Room();
        Hotel hotel=hotelService.getHotelById(hotelId).orElseThrow(()-> new ApiRequestException("Hotel is not found"));
            
        room.setName(name);
        room.setPrice(price);
        room.setDescription(description);
        room.setType(type);
        room.setAmenities(amenities);
        room.setHotel(hotel);
        roomRepository.save(room);
        return room;

    }

    @Override
    public Optional<Room> getRoomById(Long roomId) {

        return roomRepository.findById(roomId);
    }

    @Override
    public List<Room> getAllRooms() {

        return roomRepository.findAll();
    }

    @Override
    public void deleteRoom(Long id) {

        roomRepository.deleteById(id);
    }
    @Override
    public List<Room> findAllByHotelId(Long hotelId) {

        return roomRepository.findAllByHotel_HotelId(hotelId);
}

}