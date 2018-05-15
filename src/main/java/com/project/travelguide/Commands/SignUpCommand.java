package com.project.travelguide.Commands;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

import javax.persistence.Id;
import javax.validation.constraints.Email;

@Getter
@Setter

public class SignUpCommand {
    @Id
    private Long id;
    @Email
    private String email;
    private String firstName;
    private String lastName;
    private String accPassword;
    private Byte[] profileImage;
    @URL
    private String url;
}
