package com.example.hostel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hostel.entity.BroadCast;

@Repository
public interface BroadCastRepository extends JpaRepository<BroadCast, Long> {

}
