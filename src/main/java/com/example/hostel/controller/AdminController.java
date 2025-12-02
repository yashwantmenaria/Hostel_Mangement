package com.example.hostel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hostel.entity.User;
import com.example.hostel.service.UserService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/admin")
public class AdminController {

	@Autowired
    private UserService userService;

	@GetMapping("/all")
	public ResponseEntity<?> getAllUsers(
	    @RequestParam(defaultValue = "0") int page,
	    @RequestParam(defaultValue = "10") int size,
	    @RequestParam(defaultValue = "createdAt") String sortBy,
	    @RequestParam(defaultValue = "desc") String sortDir
	) {
	    Sort sort = sortDir.equalsIgnoreCase("asc") ?
	                Sort.by(sortBy).ascending() :
	                Sort.by(sortBy).descending();

	    Pageable pageable = PageRequest.of(page, size, sort);
	    List<User> userPage = userService.getAll(pageable);

	    return ResponseEntity.ok(userPage);
	}

    @GetMapping("/due-today")
    public ResponseEntity<List<User>> getDueStudents() {
        return ResponseEntity.ok(userService.getUsersWithDueToday());
    }
}