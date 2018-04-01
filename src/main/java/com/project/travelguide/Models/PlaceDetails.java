package com.project.travelguide.Models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class PlaceDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String placeName;
    @Lob
    private String Description;
    private int overAllBugetRange;
    @OneToOne(cascade = CascadeType.ALL)
    private ReviewType reviewType;
    @Lob
    private Byte[] placeImage;
}

