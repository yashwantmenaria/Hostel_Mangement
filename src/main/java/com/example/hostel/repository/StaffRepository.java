package com.example.hostel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hostel.entity.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {
    List<Staff> findByIsActiveTrue();
    List<Staff> findByRole(String role);
}