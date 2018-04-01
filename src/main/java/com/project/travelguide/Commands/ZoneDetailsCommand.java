package com.project.travelguide.Commands;

import com.project.travelguide.Models.PlaceDetails;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ZoneDetailsCommand {
    private Long id;
    private PlaceDetails placeDetails;
    private String placeName;
}
