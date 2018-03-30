package com.project.travelguide.Converter;

import com.project.travelguide.Commands.PlaceDetailsCommand;
import com.project.travelguide.Models.PlaceDetails;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PlaceDetailsCommandToPlaceDetails implements Converter<PlaceDetailsCommand,PlaceDetails> {

    @Override
    public PlaceDetails convert(PlaceDetailsCommand source) {
        if(source == null)return null;
        final PlaceDetails placeDetails = new PlaceDetails();
        placeDetails.setId(source.getId());
        placeDetails.setDescription(source.getDescription());
        placeDetails.setOverAllBugetRange(source.getOverAllBugetRange());
        placeDetails.setPlaceImage(source.getPlaceImage());
        placeDetails.setPlaceName(source.getPlaceName());
        placeDetails.setReviewType(source.getReviewType());

        return placeDetails;
    }
}
