package com.example.hotelbooking.hotelpackage.controller;

import com.example.hotelbooking.hotelpackage.Service.hotelservice.HotelService;
import com.example.hotelbooking.hotelpackage.dto.request.CreateHotelDto;
import com.example.hotelbooking.hotelpackage.dto.request.UpdateHotelDto;
import com.example.hotelbooking.hotelpackage.models.Hotel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/web/api/hotel")
public class HotelController {

    private final HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    // Add a new hotel
    @PostMapping("/add")
    public ResponseEntity<Hotel> addHotel(@RequestBody CreateHotelDto data) {
        Hotel hotel = hotelService.addHotel(data.name(), data.location(),data.description(),data.contactInfo(),data.totalRooms());
        return ResponseEntity.status(201).body(hotel);
    }

    // Get a hotel
    @GetMapping("/display")
    public ResponseEntity<Optional<Hotel>> getHotelById(@PathVariable Long id) {
        return ResponseEntity.ok(hotelService.getHotelById(id));
    }

    // Get all hotels
    @GetMapping("/all")
    public ResponseEntity<List<Hotel>> getAllHotels() {
        return ResponseEntity.ok(hotelService.getAllHotels());
    }

    // Update 
    @PostMapping("/update")
    public ResponseEntity<Hotel> updateHotel( @RequestBody UpdateHotelDto data) {
        Hotel updatedHotel = hotelService.updateHotel(data.hotelId(),data.name(),data.location(),data.description(),data.contactInfo(),data.totalRooms());
        return ResponseEntity.ok(updatedHotel);
    }

    // Delete  
    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteHotel(@RequestParam("hotelId") Long hotelId) {
        hotelService.deleteHotel(hotelId);
        return ResponseEntity.ok("Hotel deleted successfully.");
    }
}
