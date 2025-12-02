package com.example.hostel.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hostel.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
	Optional<User> findByEmailAndIsActiveTrueAndIsDeletedFalse(String username);

	//List<User> findUsersWithDueTodayAndIsActiveTrueAndIsDeletedFalse(LocalDate now);

	List<User> findByIsActiveTrueAndIsDeletedFalse(Pageable pageable);

	List<User> findAllByRoomNoAndIsActiveTrueAndIsDeletedFalse(Long roomNo);

}