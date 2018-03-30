package com.project.travelguide.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Hotels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hotelId;
    private String hotelName;

    @Enumerated(value = EnumType.STRING)
    private Rating rating;

    @OneToOne(cascade = CascadeType.ALL)
    private ZoneDetails zoneDetails;
    private String placeName;

    @Lob
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
