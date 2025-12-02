package com.example.hostel.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hostel.entity.Room;
import com.example.hostel.entity.User;
import com.example.hostel.repository.RoomRepository;
import com.example.hostel.repository.UserRepository;
import com.example.hostel.response.RoomUserResponse;
import com.example.hostel.service.RoomService;

@Service
public class RoomServiceImple implements RoomService {

	@Autowired
	private RoomRepository roomRepository;
	
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public Room save(Room room) {
        return roomRepository.save(room);
	}

	@Override
	public List<Room> getAll() {
        return roomRepository.findAll();
	}

	@Override
	public RoomUserResponse getUserDetailBasedOnRoom(Long roomNo) {
		   List<User> users = userRepo.findAllByRoomNoAndIsActiveTrueAndIsDeletedFalse(roomNo);

		    if (users.isEmpty()) {
		        return new RoomUserResponse(roomNo, "N/A", List.of());
		    }

		    Long roomType = users.get(0).getRoomType(); // assuming Room object inside User
		    List<String> names = users.stream()
		            .map(u -> u.getFirstName() + " " + u.getLastName())
		            .toList();

		    return new RoomUserResponse(roomNo, roomType.toString(), names);
	}

}
