package com.example.hotelbooking.hotelpackage.models;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "Booking")
@Data
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;

    @ManyToOne
    @JoinColumn(nullable = false,name="userId")
    @JsonBackReference
    private User user;

    @ManyToOne
    @JoinColumn(nullable = false,name="roomId")
    @JsonBackReference
    private Room room;

    @Column(nullable = false)
    private LocalDate checkInDate;

    @Column(nullable = false)
    private LocalDate checkOutDate;

    @Column(nullable = false)
    private double totalPrice;

}


    























    // public Long getId() {
    //     return id;
    // }

    // public void setId(Long id) {
    //     this.id = id;
    // }

    // public User getUser() {
    //     return user;
    // }

    // public void setUser(User user) {
    //     this.user = user;
    // }

    // public Room getRoom() {
    //     return room;
    // }

    // public void setRoom(Room room) {
    //     this.room = room;
    // }

    // public LocalDate getCheckInDate() {
    //     return checkInDate;
    // }

    // public void setCheckInDate(LocalDate checkInDate) {
    //     this.checkInDate = checkInDate;
    // }

    // public LocalDate getCheckOutDate() {
    //     return checkOutDate;
    // }

    // public void setCheckOutDate(LocalDate checkOutDate) {
    //     this.checkOutDate = checkOutDate;
    // }

    // public double getTotalPrice() {
    //     return totalPrice;
    // }

    // public void setTotalPrice(double totalPrice) {
    //     this.totalPrice = totalPrice;
    // }

