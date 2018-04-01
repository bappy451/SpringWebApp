package com.project.travelguide.Commands;

import com.project.travelguide.Models.ReviewType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PlaceDetailsCommand {

    private Long id;
    private String placeName;
    private String Description;
    private int overAllBugetRange;
    private ReviewType reviewType;
    private Byte[] placeImage;
}
