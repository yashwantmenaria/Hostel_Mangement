package com.example.hostel.service;

public interface EmailService {

    void sendResetPasswordEmail(String toEmail, String resetLink);

}
