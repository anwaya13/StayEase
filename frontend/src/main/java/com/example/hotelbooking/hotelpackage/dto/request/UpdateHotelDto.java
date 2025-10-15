package com.example.hotelbooking.hotelpackage.dto.request;

public record UpdateHotelDto(Long hotelId,String name, String location, String description, String contactInfo, int totalRooms) {
    
}
