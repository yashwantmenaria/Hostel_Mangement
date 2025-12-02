package com.example.hostel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class HostelMangementApplication {

	public static void main(String[] args) {
		SpringApplication.run(HostelMangementApplication.class, args);
	}

}
