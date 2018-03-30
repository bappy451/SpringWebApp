package com.project.travelguide.Converter;

import com.project.travelguide.Commands.HotelCommand;
import com.project.travelguide.Models.Hotels;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class HotelCommandToHotel implements Converter<HotelCommand, Hotels> {

    @Override
    public Hotels convert(HotelCommand source) {
        if(source == null) return null;

        final Hotels hotels = new Hotels();
        hotels.setHotelId(source.getHotelId());
        hotels.setHotelImage(source.getHotelImage());
        hotels.setHotelName(source.getHotelName());
        hotels.setPlaceName(source.getPlaceName());
        hotels.setRating(source.getRating());
        hotels.setZoneDetails(source.getZoneDetails());

        return hotels;
    }
}
