package com.example.hostel.serviceImpl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.example.hostel.entity.BroadCast;
import com.example.hostel.entity.CCTVCamera;
import com.example.hostel.repository.BroadCastRepository;
import com.example.hostel.repository.CCTVCameraRepository;
import com.example.hostel.request.BroadCastRequest;
import com.example.hostel.service.DashBoardService;

@Service
public class DashBoardServiceImpl implements DashBoardService {

	private final BroadCastRepository brodRepo;
	private final CCTVCameraRepository cctvRepo;

	public DashBoardServiceImpl(BroadCastRepository brodRepo, CCTVCameraRepository cctvRepo) {
		this.brodRepo = brodRepo;
		this.cctvRepo = cctvRepo;
	}

	@Override
	public BroadCast saveBroadCast(BroadCastRequest request) {
		// 1. Validation check (assuming request includes validation, e.g., using
		// @Validated in the Controller)
		if (request == null) {
			// Throw specific exception for invalid input
			throw new IllegalArgumentException("Broadcast request data must not be empty.");
		}

		BroadCast broadCast = new BroadCast();

		try {
			BeanUtils.copyProperties(request, broadCast);
			return brodRepo.save(broadCast);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return broadCast;
	}

	@Override
	public List<BroadCast> getBroadCast() {
		try {
			List<BroadCast> broadcasts = brodRepo.findAll();
			if (!broadcasts.isEmpty()) {
				return broadcasts;
			}
		
		} catch (DataAccessException e) {
			throw new RuntimeException("Failed to retrieve broadcasts from the database.", e);
		}
		return null;
	}

	// --- CCTV Camera Methods ---

	@Override
	public CCTVCamera saveCamaraDetails(CCTVCamera newCamera) {
		if (newCamera == null) {
			throw new IllegalArgumentException("CCTVCamera details must not be null.");
		}
		try {
			return cctvRepo.save(newCamera);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public CCTVCamera getCameras(Long floorId) {
	    if (floorId == null) {
	        throw new IllegalArgumentException("Floor ID must not be null.");
	    }
	    
	    // Handle the case where the repository might throw an exception
	    try {
	    	CCTVCamera cameras = cctvRepo.findByFloorId(floorId);
	        
	        if (cameras != null) {
	            return cameras;
	        }
	        return null;

	    } catch (DataAccessException e) {
	        // Handle database access issues
	        throw new RuntimeException("Failed to retrieve cameras from the database.", e);
	    }
	}

	@Override
	public List<CCTVCamera> allCameras() {
		return cctvRepo.findAll();
	}
}