package com.project.travelguide.Models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class SignUp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    private String accPassword;

    @Lob
    private Byte[] profileImage;
}
