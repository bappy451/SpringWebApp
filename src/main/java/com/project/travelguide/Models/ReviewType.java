package com.project.travelguide.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class ReviewType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String reviewType;
    @Lob
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
