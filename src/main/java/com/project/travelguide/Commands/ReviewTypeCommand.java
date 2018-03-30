package com.project.travelguide.Commands;

public class ReviewTypeCommand {
    private Long id;
    private String reviewType;
    private String reviewTypeDetails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReviewType() {
        return reviewType;
    }

    public void setReviewType(String reviewType) {
        this.reviewType = reviewType;
    }

    public String getReviewTypeDetails() {
        return reviewTypeDetails;
    }

    public void setReviewTypeDetails(String reviewTypeDetails) {
        this.reviewTypeDetails = reviewTypeDetails;
    }
}
