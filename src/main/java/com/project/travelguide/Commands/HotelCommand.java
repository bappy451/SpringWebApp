package com.project.travelguide.Commands;

import com.project.travelguide.Models.Rating;
import com.project.travelguide.Models.ZoneDetails;

public class HotelCommand {

    private Long hotelId;
    private String hotelName;
    private Rating rating;
    private ZoneDetails zoneDetails;
    private String placeName;
    private Byte[] hotelImage;

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public ZoneDetails getZoneDetails() {
        return zoneDetails;
    }

    public void setZoneDetails(ZoneDetails zoneDetails) {
        this.zoneDetails = zoneDetails;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public Byte[] getHotelImage() {
        return hotelImage;
    }

    public void setHotelImage(Byte[] hotelImage) {
        this.hotelImage = hotelImage;
    }
}
