package com.example.hostel.scheduler;

import java.time.LocalDate;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

// import com.example.hostel.utils.EmailService;

@Component
public class PaymentReminderScheduler {

  //  private StudentRepository studentRepository;
    // private EmailService emailService;

    @Scheduled(cron = "0 0 9 * * ?")  // Every day at 8 AM
    public void sendMonthlyRemindersBasedOnJoiningDate() {
        LocalDate today = LocalDate.now();
        int todayDayOfMonth = today.getDayOfMonth();

//        List<Student> allStudents = studentRepository.findAll();
//
//        for (Student student : allStudents) {
//            int joinDay = student.getJoinDate().getDayOfMonth();
//
//            // Check if today's day equals student's join day
//            if (joinDay == todayDayOfMonth) {
//                String message = "Hello " + student.getName() +
//                        ", your monthly hostel fee is due today (" + today + ").";
//
//                // Send Email (Optional)
//                emailService.sendEmail(
//                        student.getEmail(),
//                        "Monthly Hostel Fee Reminder",
//                        message
//                );
//
//                // Optionally: log it
//                System.out.println("Reminder sent to: " + student.getEmail());
//            }
        
     //   }
    }
}