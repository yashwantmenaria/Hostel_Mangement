package com.example.hostel.entity;

import jakarta.persistence.Entity;

@Entity
public class CCTVCamera extends BaseEntity {
	private String cameraName;
	private String username;
	private String password;
    private Long floorNumber;
	private Long floorId;

	public String getCameraName() {
		return cameraName;
	}
	public void setCameraName(String cameraName) {
		this.cameraName = cameraName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getFloorNumber() {
		return floorNumber;
	}
	public void setFloorNumber(Long floorNumber) {
		this.floorNumber = floorNumber;
	}
	@Override
	public String toString() {
		return "CCTVCamera [cameraName=" + cameraName + ", username=" + username + ", password=" + password
				+ ", floorNumber=" + floorNumber + "]";
	}
	
	
}
