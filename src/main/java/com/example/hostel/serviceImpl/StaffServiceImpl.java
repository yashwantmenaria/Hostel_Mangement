package com.example.hostel.serviceImpl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hostel.entity.Staff;
import com.example.hostel.repository.StaffRepository;
import com.example.hostel.service.StaffService;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffRepository staffRepository;

    @Override
    public List<Staff> getAllActiveStaff() {
        return staffRepository.findByIsActiveTrue();
    }

    @Override
    public List<Staff> getByRole(String role) {
        return staffRepository.findByRole(role);
    }

    @Override
    public Staff saveStaff(Staff staff) {
        staff.setAddedDate(LocalDate.now());
        return staffRepository.save(staff);
    }
}