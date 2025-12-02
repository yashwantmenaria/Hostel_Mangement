package com.example.hostel.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.example.hostel.UserDetailsRequest;
import com.example.hostel.entity.User;
import com.example.hostel.request.LoginRequest;
import com.example.hostel.response.LoginResponse;

public interface UserService {

	User register(UserDetailsRequest user);

	LoginResponse login(LoginRequest loginRequest);

	User findByEmail(String email);

	List<User> getUsersWithDueToday();

	List<User> getAll(Pageable pageable);

}
