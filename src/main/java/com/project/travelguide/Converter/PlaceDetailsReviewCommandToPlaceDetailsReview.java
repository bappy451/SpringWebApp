package com.project.travelguide.Converter;

import com.project.travelguide.Commands.PlaceDetailsReviewCommand;
import com.project.travelguide.Models.PlaceDetailsReview;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PlaceDetailsReviewCommandToPlaceDetailsReview implements Converter<PlaceDetailsReviewCommand, PlaceDetailsReview> {
    @Override
    public PlaceDetailsReview convert(PlaceDetailsReviewCommand source) {
        if (source == null)return null;
        final PlaceDetailsReview placeDetailsReview = new PlaceDetailsReview();
        placeDetailsReview.setId(source.getId());
        placeDetailsReview.setDescription(source.getDescription());
        placeDetailsReview.setRating(source.getRating());
        placeDetailsReview.setReviewType(source.getReviewType());
        placeDetailsReview.setSignUp(source.getSignUp());

        return placeDetailsReview;
    }
}
