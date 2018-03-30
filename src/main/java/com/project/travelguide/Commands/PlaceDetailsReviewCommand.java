package com.project.travelguide.Commands;

import com.project.travelguide.Models.Rating;
import com.project.travelguide.Models.ReviewType;
import com.project.travelguide.Models.SingUp;

public class PlaceDetailsReviewCommand {

    private Long id;
    private SingUp singUp;
    private ReviewType reviewType;
    private String description;
    private Rating rating;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SingUp getSingUp() {
        return singUp;
    }

    public void setSingUp(SingUp singUp) {
        this.singUp = singUp;
    }

    public ReviewType getReviewType() {
        return reviewType;
    }

    public void setReviewType(ReviewType reviewType) {
        this.reviewType = reviewType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }
}
