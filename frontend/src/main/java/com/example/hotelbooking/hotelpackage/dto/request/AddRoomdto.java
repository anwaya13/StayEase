package com.example.hotelbooking.hotelpackage.dto.request;

public record AddRoomdto(String name, double price, String description, String type, String amenities,Long hotelId) {
    
}
