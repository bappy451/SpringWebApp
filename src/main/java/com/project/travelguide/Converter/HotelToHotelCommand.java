package com.project.travelguide.Converter;

import com.project.travelguide.Commands.HotelCommand;
import com.project.travelguide.Models.Hotels;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class HotelToHotelCommand implements Converter<Hotels, HotelCommand>{

    @Override
    public HotelCommand convert(Hotels source) {
        if(source == null) return null;

        final HotelCommand command = new HotelCommand();
        command.setHotelId(source.getHotelId());
        command.setHotelImage(source.getHotelImage());
        command.setHotelName(source.getHotelName());
        command.setPlaceName(source.getPlaceName());
        command.setRating(source.getRating());
        command.setZoneDetails(source.getZoneDetails());

        return command;
    }
}
