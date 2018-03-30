package com.project.travelguide.Converter;

import com.project.travelguide.Commands.PlaceDetailsReviewCommand;
import com.project.travelguide.Models.PlaceDetailsReview;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PlaceDetailsReviewToPlaceDetailsReviewCommand implements Converter<PlaceDetailsReview, PlaceDetailsReviewCommand> {
    @Override
    public PlaceDetailsReviewCommand convert(PlaceDetailsReview source) {
        if (source == null)return null;
        final PlaceDetailsReviewCommand command = new PlaceDetailsReviewCommand();
        command.setId(source.getId());
        command.setDescription(source.getDescription());
        command.setRating(source.getRating());
        command.setReviewType(source.getReviewType());
        command.setSingUp(source.getSingUp());

        return command;
    }
}
