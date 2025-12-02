package com.example.hostel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hostel.entity.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {
	
	
}