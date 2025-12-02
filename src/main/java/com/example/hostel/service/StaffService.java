package com.example.hostel.service;

import java.util.List;

import com.example.hostel.entity.Staff;

public interface StaffService {
    List<Staff> getAllActiveStaff();
    List<Staff> getByRole(String role);
    Staff saveStaff(Staff staff);
}