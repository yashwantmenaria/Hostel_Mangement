package com.example.hostel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.hostel.entity.Room;
import com.example.hostel.response.RoomUserResponse;

@Service
public interface RoomService {

	Room save(Room room);

	List<Room> getAll();

	RoomUserResponse getUserDetailBasedOnRoom(Long roomNo);


}