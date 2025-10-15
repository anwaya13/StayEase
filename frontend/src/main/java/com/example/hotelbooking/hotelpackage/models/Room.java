package com.example.hotelbooking.hotelpackage.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="Room")
@Data
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false, length = 100)
    private String description;

    @Column(nullable = false, length = 50)
    private String type; 

    @Column(nullable = false,length = 50)
    private String amenities;

    @ManyToOne
    @JoinColumn(name="hotelId", referencedColumnName = "hotelId", nullable=false)
    @JsonBackReference
    private Hotel hotel;

    @OneToMany(mappedBy = "bookingId", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Booking> booking;
}




















    // public Long getId() {
    //     return id;
    // }

    // public void setId(Long id) {
    //     this.id = id;
    // }

    // public String getName() {
    //     return name;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public double getPrice() {
    //     return price;
    // }

    // public void setPrice(double price) {
    //     this.price = price;
    // }

    // public String getDescription() {
    //     return description;
    // }

    // public void setDescription(String description) {
    //     this.description = description;
    // }

    // public String getType() {
    //     return type;
    // }

    // public void setType(String type) {
    //     this.type = type;
    // }

    // public String getAmenities() {
    //     return amenities;
    // }

    // public void setAmenities(String amenities) {
    //     this.amenities = amenities;
   // }


