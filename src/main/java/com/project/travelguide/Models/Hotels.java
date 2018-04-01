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
    private Long id;
    private String hotelName;

    @Enumerated(value = EnumType.STRING)
    private Rating rating;

    @OneToOne(cascade = CascadeType.ALL)
    private ZoneDetails zoneDetails;
    private String placeName;

    @Lob
    private Byte[] hotelImage;
    @Lob
    private String Description;
}
