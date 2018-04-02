package com.project.travelguide.Services;

import com.project.travelguide.Commands.HotelCommand;
import com.project.travelguide.Models.Hotels;
import org.springframework.web.multipart.MultipartFile;

public interface HotelService {
    HotelCommand saveHotelCommand(HotelCommand command);
    Hotels findById(Long l);
    HotelCommand findCommandById(Long l);
    void saveImageFile(Long id, MultipartFile file);
}
