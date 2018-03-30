package com.project.travelguide.Models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class PlaceDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String placeName;

    @Lob
    private String Description;
    private int overAllBugetRange;
    @OneToOne(cascade = CascadeType.ALL)
    private ReviewType reviewType;

    @Lob
    private Byte[] placeImage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getOverAllBugetRange() {
        return overAllBugetRange;
    }

    public void setOverAllBugetRange(int overAllBugetRange) {
        this.overAllBugetRange = overAllBugetRange;
    }

    public ReviewType getReviewType() {
        return reviewType;
    }

    public void setReviewType(ReviewType reviewType) {
        this.reviewType = reviewType;
    }

    public Byte[] getPlaceImage() {
        return placeImage;
    }

    public void setPlaceImage(Byte[] placeImage) {
        this.placeImage = placeImage;
    }
}

