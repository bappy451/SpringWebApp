package com.project.travelguide.Commands;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

public class SignUpCommand {
    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    private String accPassword;
    private Byte[] profileImage;
    private String url;
}
