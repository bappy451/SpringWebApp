package com.project.travelguide.Converter;

import com.project.travelguide.Commands.ReviewTypeCommand;
import com.project.travelguide.Models.ReviewType;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ReviewTypeCommandToReviewType implements Converter<ReviewTypeCommand,ReviewType> {
    @Override
    public ReviewType convert(ReviewTypeCommand source) {
        if(source == null) return null;
        final ReviewType reviewType = new ReviewType();
        reviewType.setId(source.getId());
        reviewType.setReviewType(source.getReviewType());
        reviewType.setReviewTypeDetails(source.getReviewTypeDetails());

        return reviewType;
    }
}
