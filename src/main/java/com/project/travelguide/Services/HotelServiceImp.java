package com.project.travelguide.Services;

import com.project.travelguide.Commands.HotelCommand;
import com.project.travelguide.Converter.HotelCommandToHotel;
import com.project.travelguide.Converter.HotelToHotelCommand;
import com.project.travelguide.Models.Hotels;
import com.project.travelguide.Repositorys.HotelRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@Slf4j
@Service
public class HotelServiceImp implements HotelService {
    private final HotelRepository repository;
    private final HotelCommandToHotel commandToHotel;
    private final HotelToHotelCommand hotelToHotelCommand;

    public HotelServiceImp(HotelRepository repository, HotelCommandToHotel commandToHotel, HotelToHotelCommand hotelToHotelCommand) {
        this.repository = repository;
        this.commandToHotel = commandToHotel;
        this.hotelToHotelCommand = hotelToHotelCommand;
    }

    @Override
    public HotelCommand saveHotelCommand(HotelCommand command) {
        Hotels detached = commandToHotel.convert(command);
        Hotels saved = repository.save(detached);
        log.debug("Place is saved in DB");
        return hotelToHotelCommand.convert(saved);
    }

    @Override
    public Hotels findById(Long l) {
        Optional<Hotels> hotels = repository.findById(l);
        if(!hotels.isPresent()) throw new RuntimeException("Hotel Not Found!");

        return hotels.get();
    }

    @Override
    public HotelCommand findCommandById(Long l) {
        return hotelToHotelCommand.convert(findById(l));
    }

    @Override
    public void saveImageFile(Long id, MultipartFile file) {
        try {
            Hotels hotels = repository.findById(id).get();
            Byte[] byteObjects = new Byte[file.getBytes().length];
            int i = 0;
            for (byte b : file.getBytes()){
                byteObjects[i++] = b;
            }
            hotels.setHotelImage(byteObjects);
            repository.save(hotels);
        } catch (IOException e) {
            //todo handle better
            log.error("Error occurred", e);
            e.printStackTrace();
        }
    }
}
