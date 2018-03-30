package com.project.travelguide.Converter;

import com.project.travelguide.Commands.PlaceDetailsCommand;
import com.project.travelguide.Models.PlaceDetails;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PlaceDetailsToPlaceDetailsCommand implements Converter<PlaceDetails, PlaceDetailsCommand> {

    @Override
    public PlaceDetailsCommand convert(PlaceDetails source) {
        if(source == null)return null;
        final PlaceDetailsCommand command = new PlaceDetailsCommand();
        command.setId(source.getId());
        command.setDescription(source.getDescription());
        command.setOverAllBugetRange(source.getOverAllBugetRange());
        command.setPlaceImage(source.getPlaceImage());
        command.setPlaceName(source.getPlaceName());
        command.setReviewType(source.getReviewType());

        return command;
    }
}
