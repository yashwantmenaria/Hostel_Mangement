package com.example.hostel.response;
import java.util.List;

public class RoomUserResponse {
    private Long roomNo;
    private String roomType;
    private List<String> studentNames;

    // Constructors
    public RoomUserResponse() {}

    public RoomUserResponse(Long roomNo, String roomType, List<String> studentNames) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.studentNames = studentNames;
    }

    // Getters & Setters
    public Long getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(Long roomNo) {
        this.roomNo = roomNo;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public List<String> getStudentNames() {
        return studentNames;
    }

    public void setStudentNames(List<String> studentNames) {
        this.studentNames = studentNames;
    }
}