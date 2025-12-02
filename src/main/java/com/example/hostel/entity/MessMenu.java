package com.example.hostel.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;

@Entity
public class MessMenu extends BaseEntity {

	private String day; // MONDAY, TUESDAY, etc.
	private String breakfast;
	private String lunch;
	private String dinner;
	private String evningSnacks;
	private LocalDate menuDate; // optional: use for specific dates
	private boolean isActive = true;
	private boolean isDeleted = false;

	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getBreakfast() {
		return breakfast;
	}
	public void setBreakfast(String breakfast) {
		this.breakfast = breakfast;
	}
	public String getLunch() {
		return lunch;
	}
	public void setLunch(String lunch) {
		this.lunch = lunch;
	}
	public String getDinner() {
		return dinner;
	}
	public void setDinner(String dinner) {
		this.dinner = dinner;
	}
	public LocalDate getMenuDate() {
		return menuDate;
	}
	public void setMenuDate(LocalDate menuDate) {
		this.menuDate = menuDate;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	public String getEvningSnacks() {
		return evningSnacks;
	}
	public void setEvningSnacks(String evningSnacks) {
		this.evningSnacks = evningSnacks;
	}

	@Override
	public String toString() {
		return "MessMenu [day=" + day + ", breakfast=" + breakfast + ", lunch=" + lunch + ", dinner=" + dinner
				+ ", evningSnacks=" + evningSnacks + ", menuDate=" + menuDate + ", isActive=" + isActive
				+ ", isDeleted=" + isDeleted + "]";
	}

	// Getters and Setters
}