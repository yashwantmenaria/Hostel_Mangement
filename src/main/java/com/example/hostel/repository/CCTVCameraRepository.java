package com.example.hostel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hostel.entity.CCTVCamera;

@Repository
public interface CCTVCameraRepository extends JpaRepository<CCTVCamera, Long>{

	CCTVCamera findByFloorId(Long floorId);


}
