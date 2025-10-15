package com.example.hotelbooking.hotelpackage.dto.request;

import java.time.LocalDate;

public record CreateBookingDto(Long userId, Long roomId, LocalDate checkInDate,LocalDate checkOutDate, double totalPrice,Long hotelId) {
    
}
