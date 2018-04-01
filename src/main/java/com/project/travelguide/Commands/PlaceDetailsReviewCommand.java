package com.project.travelguide.Commands;

import com.project.travelguide.Models.Rating;
import com.project.travelguide.Models.ReviewType;
import com.project.travelguide.Models.SignUp;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PlaceDetailsReviewCommand {

    private Long id;
    private SignUp signUp;
    private ReviewType reviewType;
    private String description;
    private Rating rating;
}
