package com.example.hostel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hostel.request.MessMenuRequest;
import com.example.hostel.response.MessMenuResponse;
import com.example.hostel.service.MessMenuService;

@RestController
@RequestMapping("/api/mess")
public class MessMenuController {

	@Autowired
	private MessMenuService messMenuService;

	@PostMapping("/save")
	public ResponseEntity<MessMenuResponse> saveMenu(@RequestBody MessMenuRequest request) {
		return ResponseEntity.ok(messMenuService.saveMenu(request));
	}

	@GetMapping("/all")
	public ResponseEntity<List<MessMenuResponse>> getAllMenus() {
		return ResponseEntity.ok(messMenuService.getAllMenus());
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<MessMenuResponse> updateMenu(@PathVariable Long id, @RequestBody MessMenuRequest request) {
		return ResponseEntity.ok(messMenuService.updateMenu(id, request));
	}
}
