package com.example.hostel.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hostel.entity.MessMenu;

public interface MessMenuRepository extends JpaRepository<MessMenu, Long> {
    Optional<MessMenu> findByDayAndIsActiveTrue(String day);
    List<MessMenu> findAllByIsActiveTrueOrderByMenuDateAsc();
}