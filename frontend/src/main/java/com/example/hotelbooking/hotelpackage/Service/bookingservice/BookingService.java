package com.example.hotelbooking.hotelpackage.Service.bookingservice;

import com.example.hotelbooking.hotelpackage.models.Booking;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface BookingService {
    Booking createBooking(Long userId, Long roomId, LocalDate checkInDate,LocalDate checkOutDate, double totalPrice);
    public List<Booking> getAllBookings();
    Optional<Booking> getBookingById(Long id);
    Optional<Booking> getUserById(Long userId);
    Optional<Booking> findByRoomId(Long roomId);
    void deleteBooking(Long booking_id);

    void deleteAllBookingById(List<Long> bookingIds);
}
