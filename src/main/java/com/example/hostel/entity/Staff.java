package com.example.hostel.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;

@Entity
public class Staff extends BaseEntity{

    private String name;

    private String role;  // e.g., "Cook", "Sweeper"

    private String shift;  // e.g., "Morning", "Evening"

    private String contact;

    private Boolean isActive = true;

    private LocalDate addedDate;

    private Double rating;
    
	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public LocalDate getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(LocalDate addedDate) {
		this.addedDate = addedDate;
	}

	@Override
	public String toString() {
		return "Staff [name=" + name + ", role=" + role + ", shift=" + shift + ", contact=" + contact + ", isActive="
				+ isActive + ", addedDate=" + addedDate + ", rating=" + rating + "]";
	}
    
}