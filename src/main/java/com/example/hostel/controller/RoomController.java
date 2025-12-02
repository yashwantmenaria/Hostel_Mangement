package com.example.hostel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hostel.entity.Room;
import com.example.hostel.response.RoomUserResponse;
import com.example.hostel.service.RoomService;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {

	@Autowired
    private RoomService roomService;

    @PostMapping("/add")
    public ResponseEntity<Room> save(@RequestBody Room room) {
        return ResponseEntity.ok(roomService.save(room));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Room>> getAll() {
        return ResponseEntity.ok(roomService.getAll());
    }
    
    @GetMapping("/roomInfo")
    public ResponseEntity<RoomUserResponse> getUserDetailBasedOnRoom(@RequestParam Long roomNo) {
        return ResponseEntity.ok(roomService.getUserDetailBasedOnRoom(roomNo));
    }
}