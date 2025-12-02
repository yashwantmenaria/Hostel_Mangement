package com.example.hostel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hostel.entity.BroadCast;
import com.example.hostel.entity.CCTVCamera;
import com.example.hostel.request.BroadCastRequest;
import com.example.hostel.service.DashBoardService;

@RestController
@RequestMapping("/api/dashBoard")
public class DashBoardController {

	@Autowired
	private DashBoardService dashBoardService;

	@PostMapping("/broadcast")
	public ResponseEntity<BroadCast> saveBroadCast(@RequestBody BroadCastRequest request) {
		return ResponseEntity.ok(dashBoardService.saveBroadCast(request));
	}

	@GetMapping("/broadcast")
	public ResponseEntity<List<BroadCast>> getBroadCast() {
		return ResponseEntity.ok(dashBoardService.getBroadCast());
	}

	@PostMapping("/cameras")
	public ResponseEntity<CCTVCamera> addCameraToFloor(@RequestBody CCTVCamera newCamera) {
		return ResponseEntity.ok(dashBoardService.saveCamaraDetails(newCamera));

	}
	@GetMapping("/cameras")
	public ResponseEntity<CCTVCamera> getCameras(@RequestParam Long floorId) {
		return ResponseEntity.ok(dashBoardService.getCameras(floorId));
	}
	
	@GetMapping("/allCameras")
	public ResponseEntity<List<CCTVCamera>> allCameras() {
		return ResponseEntity.ok(dashBoardService.allCameras());
	}
}
