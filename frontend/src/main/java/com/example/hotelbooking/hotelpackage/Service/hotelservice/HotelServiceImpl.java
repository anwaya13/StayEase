package com.example.hotelbooking.hotelpackage.Service.hotelservice;

import com.example.hotelbooking.hotelpackage.models.Hotel;
import com.example.hotelbooking.hotelpackage.repository.HotelRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelServiceImpl implements HotelService {

    private final HotelRepository hotelRepository;


    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    // Add a new hotel
    @Override
    public Hotel addHotel(String name, String location, String description, String contactInfo, int totalRooms) {
        Hotel hotel = new Hotel();
        hotel.setName(name);
        hotel.setLocation(location);
        hotel.setDescription(description);
        hotel.setContactInfo(contactInfo);
        hotel.setTotalRooms(totalRooms);
        return hotelRepository.save(hotel);
    }

    // hotel by ID
    @Override
    public Optional<Hotel> getHotelById(Long id) {
        return hotelRepository.findById(id);
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    // Delete
    @Override
    public void deleteHotel(Long hotelId) {
        hotelRepository.deleteById(hotelId);
    }

    // Update an existing hotel's details
    @Override
    public Hotel updateHotel(Long hotelId, String name, String location, String description, String contactInfo, int totalRooms) {
        Optional<Hotel> hotelOptional = hotelRepository.findById(hotelId);

        if (hotelOptional.isPresent()) {
            Hotel hotel = hotelOptional.get();
            hotel.setName(name);
            hotel.setLocation(location);
            hotel.setDescription(description);
            hotel.setContactInfo(contactInfo);
            hotel.setTotalRooms(totalRooms);
            return hotelRepository.save(hotel);
        } else {
            throw new RuntimeException("Hotel with ID " + hotelId + " not found.");
        }
    }
}
