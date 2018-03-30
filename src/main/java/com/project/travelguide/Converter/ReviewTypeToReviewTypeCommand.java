package com.project.travelguide.Converter;

import com.project.travelguide.Commands.ReviewTypeCommand;
import com.project.travelguide.Models.ReviewType;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ReviewTypeToReviewTypeCommand implements Converter<ReviewType,ReviewTypeCommand> {
    @Override
    public ReviewTypeCommand convert(ReviewType source) {
        if(source == null) return null;
        final ReviewTypeCommand command = new ReviewTypeCommand();
        command.setId(source.getId());
        command.setReviewType(source.getReviewType());
        command.setReviewTypeDetails(source.getReviewTypeDetails());

        return command;
    }
}
