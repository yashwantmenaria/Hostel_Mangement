package com.example.hostel.serviceImpl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.server.ResponseStatusException;

import com.example.hostel.UserDetailsRequest;
import com.example.hostel.entity.User;
import com.example.hostel.repository.UserRepository;
import com.example.hostel.request.LoginRequest;
import com.example.hostel.request.ResetPasswordRequest;
import com.example.hostel.response.LoginResponse;
import com.example.hostel.security.JwtUtil;
import com.example.hostel.service.EmailService;
import com.example.hostel.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private JwtUtil jwtUtil;

	@Autowired
	private EmailService emailService;

	@Override
	public User register(UserDetailsRequest request) {
		try {
			Optional<User> optionalUser = userRepo.findByEmailAndIsActiveTrueAndIsDeletedFalse(request.getEmail());
			User user;
			if (optionalUser.isPresent()) {
				// Existing user - update full profile
				user = optionalUser.get();
				updateUserDetails(user, request);
			} else {
				// New user - basic details + password
				user = new User();
				user.setFirstName(request.getFirstName());
				user.setLastName(request.getLastName());
				user.setEmail(request.getEmail());
				user.setMobile(request.getMobile());
				user.setPassword(passwordEncoder.encode(request.getPassword()));
				user.setIsActive(true);
				user.setIsDeleted(false);
				user.setRole(request.getRole());
			}
			return userRepo.save(user);

		} catch (Exception e) {
			// Log the exception if using a logger (optional)
			logger.error("Error during user registration::::::{}", e.getMessage());
			throw new RuntimeException("User registration failed. Please try again.", e);
		}
	}

	private void updateUserDetails(User user, UserDetailsRequest request) {
		user.setRegisterNumber(request.getRegisterNumber());
		user.setRole("User");
		user.setGuardianName(request.getGuardianName());
		user.setGuardianPhone(request.getGuardianPhone());
		user.setAddress(request.getAddress());
		user.setDob(request.getDob());
		user.setBloodGroup(request.getBloodGroup());
		user.setRoomNo(request.getRoomNo());
		user.setSecurityDeposit(request.getSecurityDeposit());
		user.setAdharCard(request.getAdharCard());
		user.setProfilePic(request.getProfilePic());
		user.setIsActive(true);
		user.setIsDeleted(false);
		user.setAlmiraNumber(null);
		user.setBadNumber(null);
		user.setExitDate(null);
		user.setSecurityDeposit(null);
		user.setWorkOrClgName(null);
		user.setRoomType(null);
	}

	@Override
	public LoginResponse login(LoginRequest loginRequest) {
		String email = loginRequest.getEmail();
		String rawPassword = loginRequest.getPassword();

		if (email == null || rawPassword == null) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Email and password are required.");
		}

		Optional<User> optionalUser = userRepo.findByEmailAndIsActiveTrueAndIsDeletedFalse(email);

		if (optionalUser.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Invalid credentials.");
		}

		User user = optionalUser.get();

		if (!passwordEncoder.matches(rawPassword, user.getPassword())) {
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Invalid credentials.");
		}

		String token = jwtUtil.generateToken(user.getEmail());

		return new LoginResponse(token, user.getRole(), user.getFirstName() + " " + user.getLastName(),
				user.getFirstName());
	}

	@Override
	public User findByEmail(String email) {
		return userRepo.findByEmailAndIsActiveTrueAndIsDeletedFalse(email)
				.orElseThrow(() -> new ResourceNotFoundException("User not found with email: " + email));
	}

	public class ResourceNotFoundException extends RuntimeException {
		/**
		 * 
		 */
		private static final long serialVersionUID = 5561938392284745921L;

		public ResourceNotFoundException(String message) {
			super(message);
		}
	}

	@Override
	public List<User> getUsersWithDueToday() {
		return null; // userRepo.findUsersWithDueTodayAndIsActiveTrueAndIsDeletedFalse(LocalDate.now());
	}

	@Override
	public List<User> getAll(Pageable pageable) {
		return userRepo.findByIsActiveTrueAndIsDeletedFalse(pageable);
	}

	@Override
	public void sendResetLink(String email) {

		User user = this.findByEmail(email);

		if (!ObjectUtils.isEmpty(user)) {

			String token = UUID.randomUUID().toString();

			user.setResetToken(token);
			user.setTokenExpiry(LocalDateTime.now().plusMinutes(15));

			userRepo.save(user);

			String resetLink = "http://localhost:8080/reset-password.html?token=" + token;

			this.emailService.sendResetPasswordEmail(user.getEmail(), resetLink);

		}
	}

	@Override
	public void resetPassword(ResetPasswordRequest request) {

		User user = userRepo.findByResetToken(request.getToken())
				.orElseThrow(() -> new RuntimeException("Invalid token"));

		if (user.getTokenExpiry().isBefore(LocalDateTime.now())) {
			throw new RuntimeException("Token expired");
		}

		user.setPassword(passwordEncoder.encode(request.getNewPassword()));
		user.setResetToken(null);
		user.setTokenExpiry(null);

		userRepo.save(user);
	}

	public class InvalidCredentialsException extends RuntimeException {
		public InvalidCredentialsException(String message) {
			super(message);
		}
	}
}
