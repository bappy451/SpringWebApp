package com.project.travelguide.Commands;

import com.project.travelguide.Models.PlaceDetails;

public class ZoneDetailsCommand {
    private Long id;
    private PlaceDetails placeDetails;
    private String placeName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PlaceDetails getPlaceDetails() {
        return placeDetails;
    }

    public void setPlaceDetails(PlaceDetails placeDetails) {
        this.placeDetails = placeDetails;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }
}
