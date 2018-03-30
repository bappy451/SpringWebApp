package com.project.travelguide.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class ZoneDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long zoneCode;
    @OneToOne(cascade = CascadeType.ALL)
    private PlaceDetails placeDetails;
    private String placeName;
}
