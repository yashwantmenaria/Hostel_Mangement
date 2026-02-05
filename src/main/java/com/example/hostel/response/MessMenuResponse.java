package com.example.hostel.response;

import java.time.LocalDate;

public class MessMenuResponse {
	private Long id;
    private String day;
    private String breakfast;
    private String lunch;
    private String dinner;
    private LocalDate menuDate;
    private String evningSnacks;
	


	public Long getId(){
		return id;
	}
	public void setId(Long id){
		this.id = id;
	}
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
	public String getEvningSnacks() {
		return evningSnacks;
	}
	public void setEvningSnacks(String evningSnacks) {
		this.evningSnacks = evningSnacks;
	}
    
    
}