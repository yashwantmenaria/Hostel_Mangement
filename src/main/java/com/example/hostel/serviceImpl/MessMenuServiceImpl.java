package com.example.hostel.serviceImpl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hostel.entity.MessMenu;
import com.example.hostel.repository.MessMenuRepository;
import com.example.hostel.request.MessMenuRequest;
import com.example.hostel.response.MessMenuResponse;
import com.example.hostel.service.MessMenuService;

@Service
public class MessMenuServiceImpl implements MessMenuService {

    @Autowired
    private MessMenuRepository menuRepo;

    @Override
    public MessMenuResponse saveMenu(MessMenuRequest request) {
        MessMenu menu = new MessMenu();
        BeanUtils.copyProperties(request, menu);
        MessMenu saved = menuRepo.save(menu);
        return convertToResponse(saved);
    }

    @Override
    public List<MessMenuResponse> getAllMenus() {
        return menuRepo.findAllByIsActiveTrueOrderByMenuDateAsc()
                       .stream().map(this::convertToResponse).toList();
    }

    @Override
    public MessMenuResponse updateMenu(Long id, MessMenuRequest request) {
        MessMenu menu = menuRepo.findById(id).orElseThrow(() -> new RuntimeException("Menu not found"));
        menu.setBreakfast(request.getBreakfast());
        menu.setLunch(request.getLunch());
        menu.setDinner(request.getDinner());
        menu.setMenuDate(request.getMenuDate());
        menu.setEvningSnacks(request.getEvningSnacks());
        return convertToResponse(menuRepo.save(menu));
    }

    private MessMenuResponse convertToResponse(MessMenu menu) {
        MessMenuResponse res = new MessMenuResponse();
        BeanUtils.copyProperties(menu, res);
        return res;
    }
}