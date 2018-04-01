package com.project.travelguide.Commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DistanceMeterCommand {

    private Long id;
    private String stringZone;
    private String endingZone;
    private String totalDistance;
}
