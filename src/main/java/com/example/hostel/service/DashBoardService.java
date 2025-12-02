package com.example.hostel.service;

import java.util.List;

import com.example.hostel.entity.BroadCast;
import com.example.hostel.entity.CCTVCamera;
import com.example.hostel.request.BroadCastRequest;

public interface DashBoardService {

	BroadCast saveBroadCast(BroadCastRequest request);

	List<BroadCast> getBroadCast();

	CCTVCamera saveCamaraDetails(CCTVCamera newCamera);

	CCTVCamera getCameras(Long floorId);

	List<CCTVCamera> allCameras();

}
