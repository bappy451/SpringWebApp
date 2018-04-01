package com.project.travelguide.Services;

import com.project.travelguide.Commands.PlaceDetailsCommand;
import com.project.travelguide.Converter.PlaceDetailsCommandToPlaceDetails;
import com.project.travelguide.Converter.PlaceDetailsToPlaceDetailsCommand;
import com.project.travelguide.Models.PlaceDetails;
import com.project.travelguide.Repositorys.PlaceDetailsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.Optional;

@Slf4j
@Service
public class PlaceDetailsServiceImp implements PlaceService {
    private final PlaceDetailsCommandToPlaceDetails placeDetailsCommandToPlaceDetails;
    private final PlaceDetailsToPlaceDetailsCommand placeDetailsToPlaceDetailsCommand;
    private final PlaceDetailsRepository placeDetailsRepository;

    public PlaceDetailsServiceImp(PlaceDetailsCommandToPlaceDetails placeDetailsCommandToPlaceDetails, PlaceDetailsToPlaceDetailsCommand placeDetailsToPlaceDetailsCommand, PlaceDetailsRepository placeDetailsRepository) {
        this.placeDetailsCommandToPlaceDetails = placeDetailsCommandToPlaceDetails;
        this.placeDetailsToPlaceDetailsCommand = placeDetailsToPlaceDetailsCommand;
        this.placeDetailsRepository = placeDetailsRepository;
    }

    @Override
    @Transactional
    public PlaceDetailsCommand savePlaceDetailsCommand(PlaceDetailsCommand command) {
        PlaceDetails detached = placeDetailsCommandToPlaceDetails.convert(command);
        PlaceDetails saved = placeDetailsRepository.save(detached);
        log.error("Place Saved...");
        return placeDetailsToPlaceDetailsCommand.convert(saved);
    }

    @Override
    public PlaceDetails findById(Long l) {
        Optional<PlaceDetails> placeDetails = placeDetailsRepository.findById(l);

        if(!placeDetails.isPresent()) throw new RuntimeException("Place not Found...");

        return placeDetails.get();
    }

    @Override
    @Transactional
    public PlaceDetailsCommand findCommandById(Long l) {
        return placeDetailsToPlaceDetailsCommand.convert(findById(l));
    }

    @Override
    public void saveImageFile(Long id, MultipartFile file) {

        try {
            PlaceDetails student = placeDetailsRepository.findById(id).get();

            Byte[] byteObjects = new Byte[file.getBytes().length];

            int i = 0;

            for (byte b : file.getBytes()){
                byteObjects[i++] = b;
            }

            student.setPlaceImage(byteObjects);

            placeDetailsRepository.save(student);
        } catch (IOException e) {
            //todo handle better
            log.error("Error occurred", e);

            e.printStackTrace();
        }
    }
}
