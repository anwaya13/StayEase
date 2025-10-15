package com.example.hotelbooking.hotelpackage.Service.bookingservice;

import com.example.hotelbooking.hotelpackage.models.Booking;
import com.example.hotelbooking.hotelpackage.models.Room;
import com.example.hotelbooking.hotelpackage.models.User;
import com.example.hotelbooking.hotelpackage.repository.BookingRepository;
import org.springframework.stereotype.Service;

import com.example.hotelbooking.hotelpackage.Service.roomservice.RoomService;
import com.example.hotelbooking.hotelpackage.Service.userservice.UserService;
import com.example.hotelbooking.hotelpackage.exceptions.ApiRequestException;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;
    private final UserService userService;
    private final RoomService roomService;

    public BookingServiceImpl(BookingRepository bookingRepository,UserService userService,RoomService roomService) {
        this.bookingRepository = bookingRepository;
        this.userService= userService;
        this.roomService=roomService;
    }

    @Override
    public Booking createBooking(Long userId, Long roomId, LocalDate checkInDate,LocalDate checkOutDate, double totalPrice) {
            Booking booking=new Booking();
           User user= userService.getUserById(userId);
           Room room=roomService.getRoomById(roomId).orElseThrow(()-> new ApiRequestException("Room is not found"));
           booking.setUser(user);
            booking.setRoom(room);
            booking.setCheckInDate(checkInDate);
            booking.setCheckOutDate(checkOutDate);
            booking.setTotalPrice(totalPrice);
            bookingRepository.save(booking);
            return booking;

    }

    @Override
    public Optional<Booking> getBookingById(Long id) {

        return bookingRepository.findById(id);
    }

    @Override
    public Optional<Booking> getUserById(Long userId) {
        return Optional.empty();
    }

    @Override
    public List<Booking> getAllBookings() {

        return bookingRepository.findAll();
    }

    @Override
    public void deleteBooking(Long id) {

        bookingRepository.deleteById(id);
    }

    @Override
    public Optional<Booking> findByRoomId(Long roomId) {

        return bookingRepository.findByRoom_RoomId(roomId);
    }

    @Override
    public void deleteAllBookingById(List<Long> bookingIds) {
        // TODO Auto-generated method stub
        bookingRepository.deleteAllById(bookingIds);
    }

}
