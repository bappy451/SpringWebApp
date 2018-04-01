package com.project.travelguide.Commands;

import com.project.travelguide.Models.Rating;
import com.project.travelguide.Models.ZoneDetails;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class HotelCommand {

    private Long id;
    private String hotelName;
    private Rating rating;
    private ZoneDetails zoneDetails;
    private String placeName;
    private Byte[] hotelImage;
    private String Description;
}
