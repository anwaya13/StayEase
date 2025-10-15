package com.example.hotelbooking.hotelpackage.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hotelbooking.hotelpackage.Service.bookingservice.BookingService;
import com.example.hotelbooking.hotelpackage.dto.request.CreateBookingDto;
import com.example.hotelbooking.hotelpackage.models.Booking;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/web/api/booking")

public class BookingController {
    private BookingService bookingService;
    BookingController (BookingService bookingService){
        this.bookingService=bookingService;
    }

    @PostMapping("/create")
    public ResponseEntity<Booking> createBooking(@RequestBody CreateBookingDto data  ) {
        
        return ResponseEntity.status(201).body(bookingService.createBooking(data.userId(),data.roomId(),data.checkInDate(),data.checkOutDate(),data.totalPrice()));
    }
    
    @GetMapping("/displayAll")
    public ResponseEntity<List<Booking>> displayAllBooking(){
         List<Booking> booking = bookingService.getAllBookings();
        return ResponseEntity.status(200).body(booking);
    }

   
}
