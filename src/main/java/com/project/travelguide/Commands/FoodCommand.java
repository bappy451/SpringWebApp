package com.project.travelguide.Commands;

import com.project.travelguide.Models.PlaceDetails;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
@NoArgsConstructor
public class FoodCommand {
    private Long id;
    private PlaceDetails placeDetails;
    private String foodTypeId;
    private String priceRange;
}
