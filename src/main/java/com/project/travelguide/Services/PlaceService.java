package com.project.travelguide.Services;

import com.project.travelguide.Commands.PlaceDetailsCommand;
import com.project.travelguide.Models.PlaceDetails;
import org.springframework.web.multipart.MultipartFile;

public interface PlaceService {
    PlaceDetailsCommand savePlaceDetailsCommand(PlaceDetailsCommand command);
    PlaceDetails findById(Long l);
    PlaceDetailsCommand findCommandById(Long l);
    void saveImageFile(Long id, MultipartFile file);
}
