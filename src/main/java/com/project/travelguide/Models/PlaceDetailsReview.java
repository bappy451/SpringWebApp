package com.project.travelguide.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class PlaceDetailsReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private SignUp signUp;

    @OneToOne(cascade = CascadeType.ALL)
    private ReviewType reviewType;

    @Lob
    private String description;

    @Enumerated(value = EnumType.STRING)
    private Rating rating;
}

