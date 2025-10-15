package com.example.hotelbooking.hotelpackage.dto.request;

public record CreateHotelDto(String name, String location, String description, String contactInfo, int totalRooms) {
    
}
