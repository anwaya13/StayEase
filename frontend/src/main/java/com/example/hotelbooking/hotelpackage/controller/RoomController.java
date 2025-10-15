
package com.example.hotelbooking.hotelpackage.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hotelbooking.hotelpackage.Service.roomservice.RoomService;
import com.example.hotelbooking.hotelpackage.dto.request.AddRoomdto;
import com.example.hotelbooking.hotelpackage.models.Room;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/web/api/room")

public class RoomController {
    private RoomService roomService;
    RoomController (RoomService roomService){
        this.roomService=roomService;
    }

    @PostMapping("/create")
    public ResponseEntity<Room> addRoom(@RequestBody AddRoomdto data ) {
        
        return ResponseEntity.status(201).body(roomService.addRoom(data.name(),data.price(),data.description(),data.type(),data.amenities(),data.hotelId()));
    }
    
     @GetMapping("/displayAll")
         public ResponseEntity<List<Room>> displayAllRooms(){
         List<Room> room = roomService.getAllRooms();
        return ResponseEntity.status(200).body(room);
    }

    // Delete  
    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteRoom(@RequestParam("roomId") Long roomId) {
        roomService.deleteRoom(roomId);
        return ResponseEntity.ok("Room deleted successfully.");
    }
    
}
{
    "classId":"1",
    "sectionId":"1",
    "academicYearId":"1",
    "schoolId":""   
}
