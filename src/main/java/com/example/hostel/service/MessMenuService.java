package com.example.hostel.service;

import java.util.List;

import com.example.hostel.request.MessMenuRequest;
import com.example.hostel.response.MessMenuResponse;

public interface MessMenuService {
	MessMenuResponse saveMenu(MessMenuRequest request);

	List<MessMenuResponse> getAllMenus();

	MessMenuResponse updateMenu(Long id, MessMenuRequest request);
}
