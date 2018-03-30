package com.project.travelguide.Commands;

import com.project.travelguide.Models.PlaceDetails;

public class SafetyCommad {
    private Long id;
    private PlaceDetails placeDetails;
    private String safetyMeter;

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

    public String getSafetyMeter() {
        return safetyMeter;
    }

    public void setSafetyMeter(String safetyMeter) {
        this.safetyMeter = safetyMeter;
    }
}
